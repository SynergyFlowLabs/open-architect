package retrofit2;

import com.google.common.net.d;
import fj.h;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.e0;
import okhttp3.u;
import okhttp3.y;

/* JADX INFO: loaded from: classes14.dex */
abstract class ParameterHandler<T> {

    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, e0> converter;
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366637p;

        Body(Method method, int i10, Converter<T, e0> converter) {
            this.method = method;
            this.f366637p = i10;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) {
            if (t10 == null) {
                throw Utils.parameterError(this.method, this.f366637p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.setBody(this.converter.convert(t10));
            } catch (IOException e10) {
                throw Utils.parameterError(this.method, e10, this.f366637p, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Field(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, strConvert, this.encoded);
        }
    }

    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366638p;
        private final Converter<T, String> valueConverter;

        FieldMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f366638p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @h Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f366638p, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f366638p, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f366638p, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f366638p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addFormField(key, strConvert, this.encoded);
            }
        }
    }

    static final class Header<T> extends ParameterHandler<T> {
        private final boolean allowUnsafeNonAsciiValues;
        private final String name;
        private final Converter<T, String> valueConverter;

        Header(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z10;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, strConvert, this.allowUnsafeNonAsciiValues);
        }
    }

    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean allowUnsafeNonAsciiValues;
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366639p;
        private final Converter<T, String> valueConverter;

        HeaderMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f366639p = i10;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @h Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f366639p, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f366639p, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f366639p, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addHeader(key, this.valueConverter.convert(value), this.allowUnsafeNonAsciiValues);
            }
        }
    }

    static final class Headers extends ParameterHandler<u> {
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366640p;

        Headers(Method method, int i10) {
            this.method = method;
            this.f366640p = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @h u uVar) {
            if (uVar == null) {
                throw Utils.parameterError(this.method, this.f366640p, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.addHeaders(uVar);
        }
    }

    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, e0> converter;
        private final u headers;
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366641p;

        Part(Method method, int i10, u uVar, Converter<T, e0> converter) {
            this.method = method;
            this.f366641p = i10;
            this.headers = uVar;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) {
            if (t10 == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t10));
            } catch (IOException e10) {
                throw Utils.parameterError(this.method, this.f366641p, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366642p;
        private final String transferEncoding;
        private final Converter<T, e0> valueConverter;

        PartMap(Method method, int i10, Converter<T, e0> converter, String str) {
            this.method = method;
            this.f366642p = i10;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @h Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f366642p, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f366642p, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f366642p, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addPart(u.u(d.f119472a0, "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
            }
        }
    }

    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366643p;
        private final Converter<T, String> valueConverter;

        Path(Method method, int i10, String str, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f366643p = i10;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) throws IOException {
            if (t10 != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t10), this.encoded);
                return;
            }
            throw Utils.parameterError(this.method, this.f366643p, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }
    }

    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Query(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, strConvert, this.encoded);
        }
    }

    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366644p;
        private final Converter<T, String> valueConverter;

        QueryMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f366644p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @h Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f366644p, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f366644p, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f366644p, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f366644p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addQueryParam(key, strConvert, this.encoded);
            }
        }
    }

    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        QueryName(Converter<T, String> converter, boolean z10) {
            this.nameConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t10), null, this.encoded);
        }
    }

    static final class RawPart extends ParameterHandler<y.c> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @h y.c cVar) {
            if (cVar != null) {
                requestBuilder.addPart(cVar);
            }
        }
    }

    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f366645p;

        RelativeUrl(Method method, int i10) {
            this.method = method;
            this.f366645p = i10;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h Object obj) {
            if (obj == null) {
                throw Utils.parameterError(this.method, this.f366645p, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.setRelativeUrl(obj);
        }
    }

    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        Tag(Class<T> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, @h T t10) {
            requestBuilder.addTag(this.cls, t10);
        }
    }

    ParameterHandler() {
    }

    abstract void apply(RequestBuilder requestBuilder, @h T t10) throws IOException;

    final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            void apply(RequestBuilder requestBuilder, @h Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i10));
                }
            }
        };
    }

    final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, @h Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }
}
