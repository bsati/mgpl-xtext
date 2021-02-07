// Global game-framework vars
let canvas;
let context;

let Invaders = { w: 500, h: 500, x: 300, y: 200, speed: 100 }

// Global variables
let alien_increment = 6;
let alien_y_increment = 0;
let bullet_increment = 17;
let counter = 0;
let i;

// Animations
function lead_alien_animate(lead_alien) {
	if(Invaders.w - 100 < lead_alien.x + alien_increment || lead_alien.x + alien_increment < 100) {
		alien_increment = -alien_increment;
	} 
	if(2 <= counter) {
		alien_y_increment = -1;
		counter = 0;
	}  else {
		counter = counter + 1;
		alien_y_increment = 0;
	} 
	lead_alien.x = lead_alien.x + alien_increment;
	lead_alien.y = lead_alien.y + alien_y_increment;
}

function alien_animate(alien) {
	alien.x = alien.x + alien_increment;
	alien.y = alien.y + alien_y_increment;
}

function bullet_animate(cur_bullet) {
	if(cur_bullet.visible) {
		for(i = 0; i < 10; i = i + 1) {
			if(aliens[i].visible && touches(cur_bullet, aliens[i])) {
				aliens[i].visible = 0;
				cur_bullet.visible = 0;
			} 
		}
		cur_bullet.y = cur_bullet.y + bullet_increment;
		if(Invaders.h < cur_bullet.y) {
			cur_bullet.visible = 0;
		} 
	} 
}

let aliens = [createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle), createDefaultGameObj(objTypes.Circle)];
let bullets = [createDefaultGameObj(objTypes.Rectangle), createDefaultGameObj(objTypes.Rectangle), createDefaultGameObj(objTypes.Rectangle), createDefaultGameObj(objTypes.Rectangle), createDefaultGameObj(objTypes.Rectangle)];
let gun = {x: 250, y: 50, w: 25, h: 12, type: objTypes.Triangle, visible: 1};

let gameObjs = [aliens, bullets, gun]

// KeyEvents
function leftarrow() {
	if(50 < gun.x) {
		gun.x = gun.x - 5;
	} 
}

function rightarrow() {
	if(gun.x < Invaders.w - 50) {
		gun.x = gun.x + 5;
	} 
}

function space() {
	for(i = 0; i < 5; i = i + 1) {
		if(!bullets[i].visible) {
			bullets[i].visible = 1;
			bullets[i].x = gun.x + gun.w / 2;
			bullets[i].y = gun.y + gun.h;
			i = 6;
		} 
	}
}

// KeyMap to work with in the input loop
let keyMap = new Map();
keyMap.set('ArrowLeft', { keydown: false, onDown: leftarrow });
keyMap.set('ArrowRight', { keydown: false, onDown: rightarrow });
keyMap.set(' ', { keydown: false, onDown: space });

for(i = 0; i < 5; i = i + 1) {
	bullets[i].w = 2;
	bullets[i].h = 20;
	bullets[i].visible = 0;
	bullets[i].anim = bullet_animate;
}
for(i = 0; i < 10; i = i + 1) {
	aliens[i].r = 4;
	aliens[i].anim = alien_animate;
}
aliens[0].anim = lead_alien_animate;
aliens[0].x = 250;
aliens[0].y = 300;
aliens[1].x = 230;
aliens[1].y = 320;
aliens[2].x = 270;
aliens[2].y = 320;
aliens[3].x = 210;
aliens[3].y = 340;
aliens[4].x = 250;
aliens[4].y = 340;
aliens[5].x = 290;
aliens[5].y = 340;
aliens[6].x = 190;
aliens[6].y = 360;
aliens[7].x = 230;
aliens[7].y = 360;
aliens[8].x = 270;
aliens[8].y = 360;
aliens[9].x = 310;
aliens[9].y = 360;

window.onload = init;

function init() {
    canvas = document.getElementById('gameCanvas');
    context = canvas.getContext('2d');

    window.addEventListener('keydown', (e) => {
        if (keyMap.has(e.key)) {
            keyMap.get(e.key).keydown = true;
        }
    }, true);

    window.addEventListener('keyup', (e) => {
        if (keyMap.has(e.key)) {
            keyMap.get(e.key).keydown = false;
        }
    }, true);

    window.requestAnimationFrame(gameLoop);
    window.requestAnimationFrame(inputLoop);
}

function gameLoop() {
    // blank fill background
    context.fillStyle = 'white';
    context.fillRect(0, 0, canvas.width, canvas.height);

    // Animate and draw objects
    gameObjs.forEach(obj => {
    	if (Array.isArray(obj)) {
    		obj.forEach(x => {
    			if (x.anim) {
    				x.anim(x)
    			}
    		})
    	} else {
    		if (obj.anim) {
    			obj.anim(obj);
    		}
    	}
    	draw(obj);
    });

    // request next animation frame
    window.setTimeout(() => window.requestAnimationFrame(gameLoop), 1000 / 100);
}

function inputLoop() {
    // Execute input updates
    keyMap.forEach((value, key) => {
        if (value.keydown) {
            value.onDown();
        }
    });

    // blank fill background
    context.fillStyle = 'white';
    context.fillRect(0, 0, canvas.width, canvas.height);

    // Animate and draw objects
    gameObjs.forEach(obj => {
        draw(obj);
    });

    window.setTimeout(() => window.requestAnimationFrame(inputLoop), 1000 / 100);
}
