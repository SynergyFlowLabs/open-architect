package retrofit2;

import fj.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.e0;
import okhttp3.g0;

/* JADX INFO: loaded from: classes14.dex */
public interface Converter<F, T> {

    public static abstract class Factory {
        protected static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i10, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return Utils.getRawType(type);
        }

        @h
        public Converter<?, e0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        @h
        public Converter<g0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        @h
        public Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    @h
    T convert(F f10) throws IOException;
}
