package retrofit2;

import fj.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.g0;

/* JADX INFO: loaded from: classes14.dex */
@e.b(24)
@zl.a
public final class OptionalConverterFactory extends Converter.Factory {

    @zl.a
    static final class OptionalConverter<T> implements Converter<g0, Optional<T>> {
        private final Converter<g0, T> delegate;

        OptionalConverter(Converter<g0, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(g0 g0Var) throws IOException {
            return Optional.ofNullable(this.delegate.convert(g0Var));
        }
    }

    OptionalConverterFactory() {
    }

    public static OptionalConverterFactory create() {
        return new OptionalConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    @h
    public Converter<g0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
