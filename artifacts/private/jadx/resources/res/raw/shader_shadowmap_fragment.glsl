#extension GL_OES_standard_derivatives : enable

#ifdef GL_ES
#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif
#endif

#define EXPONENT_MAX 5.0
#define EXPONENT_MIN 5.0

varying vec4 v_position;

vec2 pack2(float v) {
  vec2 color = vec2(v, fract(v * 255.0));
  return color - (color.yy * vec2(1.0 / 255.0, 0.0));
}

vec3 pack3(float value) {
  vec3 color = vec3(value, fract(value * 255.0), fract(value * 65025.0));
  return color - (color.zyy * vec3(1.0 / 255.0, 1.0 / 255.0, 0.0));
}

vec4 pack4(float value) {
	vec4 color = vec4(value, fract(value * 255.0), fract(value * 65025.0), fract(value * 16581375.0));
	return color - (color.yzww * vec4(1.0 / 255.0, 1.0 / 255.0, 1.0 / 255.0, 0.0));
}

vec2 ESM(float value) {
  return vec2(exp(EXPONENT_MAX * value) / exp(EXPONENT_MAX), exp(-EXPONENT_MIN * value) / exp(EXPONENT_MIN));
}

void main() {
	float normalizedDepth  = ((v_position.z / v_position.w) + 1.0) / 2.0;
	#ifdef EVSM
		vec2 moments = ESM(normalizedDepth);
		gl_FragColor = vec4(moments.x, moments.x * moments.x, moments.y, moments.y * moments.y);
	#elif defined(VSM)
		float moment = normalizedDepth * normalizedDepth;
		#ifdef GL_OES_standard_derivatives
			float dx = dFdx(normalizedDepth);
			float dy = dFdy(normalizedDepth);
			moment += 0.25 * (dx * dx + dy * dy);
		#endif
		gl_FragColor = vec4(pack2(normalizedDepth), pack2(moment));
	#else
		gl_FragColor = pack4(normalizedDepth);
	#endif
}