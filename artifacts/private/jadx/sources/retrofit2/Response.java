package retrofit2;

import fj.h;
import java.util.Objects;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.u;

/* JADX INFO: loaded from: classes14.dex */
public final class Response<T> {

    @h
    private final T body;

    @h
    private final g0 errorBody;
    private final f0 rawResponse;

    private Response(f0 f0Var, @h T t10, @h g0 g0Var) {
        this.rawResponse = f0Var;
        this.body = t10;
        this.errorBody = g0Var;
    }

    public static <T> Response<T> error(int i10, g0 g0Var) {
        Objects.requireNonNull(g0Var, "body == null");
        if (i10 >= 400) {
            return error(g0Var, new f0.a().b(new OkHttpCall.NoContentResponseBody(g0Var.contentType(), g0Var.contentLength())).g(i10).y("Response.error()").B(c0.HTTP_1_1).E(new d0.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> Response<T> success(@h T t10) {
        return success(t10, new f0.a().g(200).y("OK").B(c0.HTTP_1_1).E(new d0.a().B("http://localhost/").b()).c());
    }

    @h
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.E();
    }

    @h
    public g0 errorBody() {
        return this.errorBody;
    }

    public u headers() {
        return this.rawResponse.Y();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public String message() {
        return this.rawResponse.f0();
    }

    public f0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i10, @h T t10) {
        if (i10 >= 200 && i10 < 300) {
            return success(t10, new f0.a().g(i10).y("Response.success()").B(c0.HTTP_1_1).E(new d0.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i10);
    }

    public static <T> Response<T> error(g0 g0Var, f0 f0Var) {
        Objects.requireNonNull(g0Var, "body == null");
        Objects.requireNonNull(f0Var, "rawResponse == null");
        if (!f0Var.isSuccessful()) {
            return new Response<>(f0Var, null, g0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@h T t10, u uVar) {
        Objects.requireNonNull(uVar, "headers == null");
        return success(t10, new f0.a().g(200).y("OK").B(c0.HTTP_1_1).w(uVar).E(new d0.a().B("http://localhost/").b()).c());
    }

    public static <T> Response<T> success(@h T t10, f0 f0Var) {
        Objects.requireNonNull(f0Var, "rawResponse == null");
        if (f0Var.isSuccessful()) {
            return new Response<>(f0Var, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
