precision mediump float;

attribute vec3 a_position;
uniform mat4 u_projViewWorldTrans;
varying vec4 v_position;

void main() {
	vec4 value = u_projViewWorldTrans * vec4(a_position, 1.0);
	v_position = value;
	gl_Position = value;
}