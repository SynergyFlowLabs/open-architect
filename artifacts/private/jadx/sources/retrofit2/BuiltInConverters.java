package retrofit2;

import fj.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.e0;
import okhttp3.g0;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes14.dex */
final class BuiltInConverters extends Converter.Factory {

    static final class BufferingResponseBodyConverter implements Converter<g0, g0> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public g0 convert(g0 g0Var) throws IOException {
            try {
                return Utils.buffer(g0Var);
            } finally {
                g0Var.close();
            }
        }
    }

    static final class RequestBodyConverter implements Converter<e0, e0> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        RequestBodyConverter() {
        }

        @Override // retrofit2.Converter
        public e0 convert(e0 e0Var) {
            return e0Var;
        }
    }

    static final class StreamingResponseBodyConverter implements Converter<g0, g0> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        StreamingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public g0 convert(g0 g0Var) {
            return g0Var;
        }
    }

    static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        ToStringConverter() {
        }

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class UnitResponseBodyConverter implements Converter<g0, Unit> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Unit convert(g0 g0Var) {
            g0Var.close();
            return Unit.f312394a;
        }
    }

    static final class VoidResponseBodyConverter implements Converter<g0, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Void convert(g0 g0Var) {
            g0Var.close();
            return null;
        }
    }

    BuiltInConverters() {
    }

    @Override // retrofit2.Converter.Factory
    @h
    public Converter<?, e0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (e0.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @h
    public Converter<g0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == g0.class) {
            return Utils.isAnnotationPresent(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.INSTANCE : BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        }
        if (Utils.isUnit(type)) {
            return UnitResponseBodyConverter.INSTANCE;
        }
        return null;
    }
}
