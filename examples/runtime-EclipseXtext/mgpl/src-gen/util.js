// Simple boundary check that uses axis aligned bounding boxes for overlap detection
		const touches = (obj1, obj2) => {
		    return !(obj1.x > (obj2.x + (obj2.w ?? obj2.r)) ||
		        (obj1.x + (obj1.w ?? obj1.r)) < obj2.x ||
		        obj1.y > (obj2.y + (obj2.h ?? obj2.r)) ||
		        (obj1.y + (obj1.h ?? obj1.r)) < obj2.y);
		}
		
		// ObjType enum
		const objTypes = {
		    Circle: 'Circle',
		    Rectangle: 'Rectangle',
		    Triangle: 'Triangle'
		}
		
		// Draw functions
		function draw(gameObj) {
		    if (Array.isArray(gameObj)) {
		        gameObj.forEach(obj => drawObj(obj));
		    } else {
		        drawObj(gameObj);
		    }
		}
		
		function drawObj(gameObj) {
		    if (gameObj.visible && gameObj.visible === 1) {
		        if (gameObj.type === objTypes.Rectangle) {
		            drawRectangle(gameObj);
		        } else if (gameObj.type === objTypes.Circle) {
		            drawCircle(gameObj);
		        } else if (gameObj.type === objTypes.Triangle) {
		            drawTriangle(gameObj);
		        }
		    }
		}
		
		function drawCircle(circle) {
		    context.moveTo(circle.x, circle.y);
		    context.beginPath();
		    context.arc(circle.x, circle.y, circle.r, 0, 2 * Math.PI);
		    context.fillStyle = 'black';
		    context.fill();
		    context.lineWidth = 1;
		    context.strokeStyle = 'black';
		    context.stroke();
		}
		
		function drawRectangle(rectangle) {
		    context.fillStyle = 'black';
		    context.fillRect(rectangle.x, rectangle.y, rectangle.w, rectangle.h);
		}
		
		function drawTriangle(triangle) {
		    context.moveTo(triangle.x, triangle.y)
		    context.beginPath();
		    context.lineTo(triangle.x - triangle.w / 2, triangle.y + triangle.h);
		    context.lineTo(triangle.x + triangle.w / 2, triangle.y + triangle.h);
		    context.lineTo(triangle.x, triangle.y);
		
		    context.fillStyle = 'black';
		    context.fill();
		    context.lineWidth = 1;
		    context.strokeStyle = 'black';
		    context.stroke();
		}
		
		function createDefaultGameObj(t) {
		    if (t === objTypes.Rectangle || t === objTypes.Triangle) {
		        return { x: 0, y: 0, w: 0, h: 0, visible: 1, type: t }
		    } else {
		        return { x: 0, y: 0, r: 0, visible: 1, type: t }
		    }
		}