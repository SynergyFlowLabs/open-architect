package retrofit2.converter.gson;

import com.google.gson.f;
import com.google.gson.reflect.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.e0;
import okhttp3.g0;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes14.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final f gson;

    private GsonConverterFactory(f fVar) {
        this.gson = fVar;
    }

    public static GsonConverterFactory create() {
        return create(new f());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, e0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.t(a.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<g0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.t(a.get(type)));
    }

    public static GsonConverterFactory create(f fVar) {
        if (fVar != null) {
            return new GsonConverterFactory(fVar);
        }
        throw new NullPointerException("gson == null");
    }
}
