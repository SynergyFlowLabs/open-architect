package retrofit2.converter.scalars;

import fj.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.e0;
import okhttp3.g0;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes14.dex */
public final class ScalarsConverterFactory extends Converter.Factory {
    private ScalarsConverterFactory() {
    }

    public static ScalarsConverterFactory create() {
        return new ScalarsConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    @h
    public Converter<?, e0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return ScalarRequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @h
    public Converter<g0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == String.class) {
            return ScalarResponseBodyConverters.StringResponseBodyConverter.INSTANCE;
        }
        if (type != Boolean.class && type != Boolean.TYPE) {
            if (type == Byte.class || type == Byte.TYPE) {
                return ScalarResponseBodyConverters.ByteResponseBodyConverter.INSTANCE;
            }
            if (type != Character.class && type != Character.TYPE) {
                if (type == Double.class || type == Double.TYPE) {
                    return ScalarResponseBodyConverters.DoubleResponseBodyConverter.INSTANCE;
                }
                if (type == Float.class || type == Float.TYPE) {
                    return ScalarResponseBodyConverters.FloatResponseBodyConverter.INSTANCE;
                }
                if (type != Integer.class && type != Integer.TYPE) {
                    if (type == Long.class || type == Long.TYPE) {
                        return ScalarResponseBodyConverters.LongResponseBodyConverter.INSTANCE;
                    }
                    if (type == Short.class || type == Short.TYPE) {
                        return ScalarResponseBodyConverters.ShortResponseBodyConverter.INSTANCE;
                    }
                    return null;
                }
                return ScalarResponseBodyConverters.IntegerResponseBodyConverter.INSTANCE;
            }
            return ScalarResponseBodyConverters.CharacterResponseBodyConverter.INSTANCE;
        }
        return ScalarResponseBodyConverters.BooleanResponseBodyConverter.INSTANCE;
    }
}
