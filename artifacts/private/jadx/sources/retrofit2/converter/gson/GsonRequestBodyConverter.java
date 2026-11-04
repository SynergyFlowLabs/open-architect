package retrofit2.converter.gson;

import com.google.api.client.json.c;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.stream.d;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.e0;
import okhttp3.x;
import okio.l;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes14.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, e0> {
    private static final x MEDIA_TYPE = x.h(c.f115763a);
    private final b0<T> adapter;
    private final f gson;

    GsonRequestBodyConverter(f fVar, b0<T> b0Var) {
        this.gson = fVar;
        this.adapter = b0Var;
    }

    @Override // retrofit2.Converter
    public e0 convert(T t10) throws IOException {
        l lVar = new l();
        d dVarA = this.gson.A(new OutputStreamWriter(lVar.nf(), StandardCharsets.UTF_8));
        this.adapter.write(dVarA, t10);
        dVarA.close();
        return e0.create(MEDIA_TYPE, lVar.r7());
    }
}
