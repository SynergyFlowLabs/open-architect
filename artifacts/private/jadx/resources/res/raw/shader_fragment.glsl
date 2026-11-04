#ifdef GL_ES
#define LOWP lowp
#define MED mediump
#ifdef GL_FRAGMENT_PRECISION_HIGH
#define HIGH highp
#else
#define HIGH
#endif
precision mediump float;
#else
#define HIGH
#define MED
#define LOWP
#endif

#if defined(specularTextureFlag) || defined(specularColorFlag)
#define specularFlag
#endif

#ifdef normalFlag
varying vec3 v_normal;
#endif //normalFlag

#if defined(colorFlag)
varying vec4 v_color;
#endif

#if defined(blendedFlag)
varying float v_opacity;
#elif defined(alphaTestFlag)
varying float v_alphaTest;
#endif //alphaTestFlag

#if defined(diffuseTextureFlag) || defined(specularTextureFlag)
#define textureFlag
#endif

#ifdef diffuseTextureFlag
varying MED vec2 v_diffuseUV;
#endif

#ifdef specularTextureFlag
varying MED vec2 v_specularUV;
#endif

#ifdef diffuseColorFlag
uniform vec4 u_diffuseColor;
#endif

#ifdef diffuseTextureFlag
uniform sampler2D u_diffuseTexture;
#endif

#ifdef specularColorFlag
uniform vec4 u_specularColor;
#endif

#ifdef specularTextureFlag
uniform sampler2D u_specularTexture;
#endif

#ifdef normalTextureFlag
uniform sampler2D u_normalTexture;
#endif

#ifdef lightingFlag
varying vec3 v_lightDiffuse;

#if	defined(ambientLightFlag) || defined(ambientCubemapFlag) || defined(sphericalHarmonicsFlag)
#define ambientFlag
#endif //ambientFlag

#ifdef specularFlag
varying vec3 v_lightSpecular;
#endif //specularFlag

#ifdef environmentCubemapFlag
uniform samplerCube u_environmentCubemap;
varying vec3 v_reflect;
#endif

#ifdef shadowMapFlag
uniform HIGH sampler2D u_shadowTexture;
varying vec4 v_shadowPosition;
uniform vec3 u_shadowCameraDirection;
#define separateAmbientFlag

#ifndef TEXEL_SIZE
#define TEXEL_SIZE 1.0 / 4096.0
#endif

float unpack(vec2 color) {
	return color.x + (color.y / 255.0);
}

float unpack(vec3 packedZValue) {
	return dot(packedZValue, vec3(1.0, 1.0 / 255.0, 1.0 / 65025.0));
}

float unpack(vec4 packedZValue) {
		return dot(packedZValue, vec4(1.0, 1.0 / 255.0, 1.0 / 65025.0, 1.0 / 16581375.0));
}

float calcBias(float dotNormalDirection, float maxValue) {
	 return max(0.001 * (1.0 - dotNormalDirection), maxValue);
}

float getShadowSimple(vec3 shadowMapUv, vec2 offset, float bias) {
		if (unpack(texture2D(u_shadowTexture, shadowMapUv.xy + offset)) < shadowMapUv.z - bias) {
				return 0.0;
		}
		return 1.0;
}

float getShadowSimpleSoft(vec3 shadowMapUv, float bias) {
	float shadow = 1.0;
	for (float y = -1.5; y <= 1.5; y = y + 1.0) {
		for (float x = -1.5; x <= 1.5; x = x + 1.0) {
			shadow += getShadowSimple(shadowMapUv, vec2(x * TEXEL_SIZE, y * TEXEL_SIZE), bias);
		}
	}
	shadow /= 16.0;
	return shadow <= 0.2 ? 0.0 : clamp(shadow, 0.0, 1.0);
}

float Chebyshev(vec2 moments, float mean, float minVariance) {
		if (mean <= moments.x) {
				return 1.0;
		}
		HIGH float variance = max(moments.y - (moments.x * moments.x), minVariance);
		HIGH float d = mean - moments.x;
		return variance / (variance + d * d);
}

#define EXPONENT_MAX 5.0
#define EXPONENT_MIN 5.0

vec2 ESM(float value) {
	return vec2(
		exp(EXPONENT_MAX * value) / exp(EXPONENT_MAX), exp(-EXPONENT_MIN * value) / exp(EXPONENT_MIN)
	);
}

float getShadowSimpleVSM(vec4 sampled, float value) {
	return Chebyshev(vec2(unpack(sampled.rg), unpack(sampled.ba)), value, 0.00025);
}

float getShadowExponentialVSM(vec4 sampled, float value) {
	vec2 mean = ESM(value);
	vec2 depthScale = 0.01 * vec2(EXPONENT_MAX, EXPONENT_MIN) * mean;
	vec2 minVariance = depthScale * depthScale;
	minVariance = vec2(0.001, 0.001);
	return min(
		Chebyshev(sampled.rg, mean.y, minVariance.x),
		Chebyshev(sampled.ba, mean.y, minVariance.y)
	);
}

float getShadowVSM(vec3 shadowMapUv, float x, float y) {
		vec4 sampled = texture2D(u_shadowTexture, shadowMapUv.xy + vec2(x, y));
		return getShadowSimpleVSM(sampled, shadowMapUv.z);
		//return getShadowExponentialVSM(sampled, shadowMapUv.z);
}

float getShadowVSMSoft(vec3 shadowMapUv, float region, float step, float total) {
		float sum = 0.0;
		float x = -region;
		float y;
		for (;;) {
				if (x > region) {
						break;
				}
				y = -region;
				for (;;) {
						if (y > region) {
								break;
						}
						sum += getShadowVSM(shadowMapUv, TEXEL_SIZE * x, TEXEL_SIZE * y);
						y += step;
				}
				x += step;
		}
		return sum / total;
}

float getShadow() {
		float shadow = 1.0;
		if (v_shadowPosition.w > 0.0) {
			float dotNormalDirection = dot(normalize(v_normal), normalize(u_shadowCameraDirection));
			if (dotNormalDirection >= 0.0) {
				shadow = 0.0;
			} else {
				vec3 shadowMapUv = ((v_shadowPosition.xyz / v_shadowPosition.w) + 1.0) / 2.0;
				if (
					shadowMapUv.x >= 0.0 && shadowMapUv.y >= 0.0 && shadowMapUv.z >= 0.0 &&
					shadowMapUv.x <= 1.0 && shadowMapUv.y <= 1.0 && shadowMapUv.z <= 1.0
				) {
#if defined(SHADOW_SIMPLE)
						shadow = getShadowSimple(shadowMapUv, vec2(0.0, 0.0), calcBias(dotNormalDirection, 0.0009));
#elif defined(SHADOW_SIMPLE_SOFT)
						shadow = getShadowSimpleSoft(
							shadowMapUv, calcBias(dotNormalDirection, TEXEL_SIZE >= 4096.0 ? 0.0017 : 0.003)
						);
#elif defined(SHADOW_VSM_HARD)
						shadow = getShadowVSM(shadowMapUv, 0.0, 0.0);
#elif defined(SHADOW_VSM_SOFT_1)
						shadow = getShadowVSMSoft(shadowMapUv, 3.0, 2.0, 16.0);
#elif defined(SHADOW_VSM_SOFT_2)
						shadow = getShadowVSMSoft(shadowMapUv, 4.0, 2.0, 25.0);
#endif
				}
			}
		}
		return shadow * 0.6 + 0.4;
}

#endif //shadowMapFlag

#if defined(ambientFlag) && defined(separateAmbientFlag)
varying vec3 v_ambientLight;
#endif //separateAmbientFlag

#endif //lightingFlag

#ifdef fogFlag
uniform vec4 u_fogColor;
varying float v_fog;
#endif // fogFlag

void main() {

#if defined(diffuseTextureFlag) && defined(diffuseColorFlag) && defined(colorFlag)
	vec4 diffuse = texture2D(u_diffuseTexture, v_diffuseUV) * u_diffuseColor * v_color;
#elif defined(diffuseTextureFlag) && defined(diffuseColorFlag)
	vec4 diffuse = texture2D(u_diffuseTexture, v_diffuseUV) * u_diffuseColor;
#elif defined(diffuseTextureFlag) && defined(colorFlag)
	vec4 diffuse = texture2D(u_diffuseTexture, v_diffuseUV) * v_color;
#elif defined(diffuseTextureFlag)
	vec4 diffuse = texture2D(u_diffuseTexture, v_diffuseUV);
#elif defined(diffuseColorFlag) && defined(colorFlag)
	vec4 diffuse = u_diffuseColor * v_color;
#elif defined(diffuseColorFlag)
	vec4 diffuse = u_diffuseColor;
#elif defined(colorFlag)
	vec4 diffuse = v_color;
#else
	vec4 diffuse = vec4(1.0);
#endif

#ifdef blendedFlag
	gl_FragColor.a = diffuse.a * v_opacity;
#else
#ifdef alphaTestFlag
	if (diffuse.a <= v_alphaTest) {
			discard;
	}
	gl_FragColor.a = diffuse.a;
#else
	gl_FragColor.a = 1.0;
#endif
#endif

#if defined(normalFlag)
	vec3 normal = v_normal;
#endif // normalFlag

#ifdef environmentCubemapFlag
	diffuse.rgb = mix(
	 diffuse.rgb, diffuse.rgb * textureCube(
		 u_environmentCubemap,
		 (-1.0 + 2.0 * float(gl_FrontFacing)) * vec3(-v_reflect.x, v_reflect.yz)
	 ).rgb, 0.75
 );
#endif

#if !defined(lightingFlag)
	gl_FragColor.rgb = diffuse.rgb;
#elif !defined(specularFlag)
#if defined(ambientFlag) && defined(separateAmbientFlag)
#ifdef shadowMapFlag
	gl_FragColor.rgb = (diffuse.rgb * (v_ambientLight + getShadow() * v_lightDiffuse));
#else
	gl_FragColor.rgb = (diffuse.rgb * (v_ambientLight + v_lightDiffuse));
#endif //shadowMapFlag
#else
#ifdef shadowMapFlag
	gl_FragColor.rgb = getShadow() * (diffuse.rgb * v_lightDiffuse);
#else
	gl_FragColor.rgb = (diffuse.rgb * v_lightDiffuse);
#endif //shadowMapFlag
#endif
#else
#if defined(specularTextureFlag) && defined(specularColorFlag)
vec3 specular = texture2D(u_specularTexture, v_specularUV).rgb * u_specularColor.rgb * v_lightSpecular;
#elif defined(specularTextureFlag)
vec3 specular = texture2D(u_specularTexture, v_specularUV).rgb * v_lightSpecular;
#elif defined(specularColorFlag)
vec3 specular = u_specularColor.rgb * v_lightSpecular;
#else
vec3 specular = v_lightSpecular;
#endif

#if defined(ambientFlag) && defined(separateAmbientFlag)
#ifdef shadowMapFlag
gl_FragColor.rgb = (diffuse.rgb * (getShadow() * v_lightDiffuse + v_ambientLight)) + specular;
#else
	gl_FragColor.rgb = (diffuse.rgb * (v_lightDiffuse + v_ambientLight)) + specular;
#endif //shadowMapFlag
#else
#ifdef shadowMapFlag
	gl_FragColor.rgb = getShadow() * ((diffuse.rgb * v_lightDiffuse) + specular);
#else
	gl_FragColor.rgb = (diffuse.rgb * v_lightDiffuse) + specular;
#endif //shadowMapFlag
#endif
#endif //lightingFlag

#ifdef fogFlag
	gl_FragColor.rgb = mix(gl_FragColor.rgb, u_fogColor.rgb, v_fog);
#endif // end fogFlag

}
