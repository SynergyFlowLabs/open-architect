package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.e0;
import okhttp3.x;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes14.dex */
final class ScalarRequestBodyConverter<T> implements Converter<T, e0> {
    static final ScalarRequestBodyConverter<Object> INSTANCE = new ScalarRequestBodyConverter<>();
    private static final x MEDIA_TYPE = x.h("text/plain; charset=UTF-8");

    private ScalarRequestBodyConverter() {
    }

    @Override // retrofit2.Converter
    public e0 convert(T t10) throws IOException {
        return e0.create(MEDIA_TYPE, String.valueOf(t10));
    }
}
