package retrofit2.converter.gson;

import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.m;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import java.io.IOException;
import okhttp3.g0;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes14.dex */
final class GsonResponseBodyConverter<T> implements Converter<g0, T> {
    private final b0<T> adapter;
    private final f gson;

    GsonResponseBodyConverter(f fVar, b0<T> b0Var) {
        this.gson = fVar;
        this.adapter = b0Var;
    }

    @Override // retrofit2.Converter
    public T convert(g0 g0Var) throws IOException {
        a aVarZ = this.gson.z(g0Var.charStream());
        try {
            T t10 = this.adapter.read(aVarZ);
            if (aVarZ.x() != c.END_DOCUMENT) {
                throw new m("JSON document was not fully consumed.");
            }
            g0Var.close();
            return t10;
        } catch (Throwable th2) {
            g0Var.close();
            throw th2;
        }
    }
}
