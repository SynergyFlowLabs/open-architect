package app.rive.runtime.kotlin.core;

import com.android.volley.o;
import com.android.volley.q;
import com.android.volley.s;
import com.android.volley.toolbox.m;
import com.android.volley.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BytesRequest extends s<byte[]> {

    @NotNull
    private final Function1<byte[], Unit> onResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BytesRequest(@NotNull String url, @NotNull Function1<? super byte[], Unit> onResponse, @NotNull v.a errorListener) {
        super(0, url, errorListener);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onResponse, "onResponse");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        this.onResponse = onResponse;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0007 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:4:0x0003, B:7:0x000b, B:6:0x0007), top: B:13:0x0003 }] */
    @Override // com.android.volley.s
    @NotNull
    protected v<byte[]> parseNetworkResponse(@Nullable o oVar) {
        byte[] bArr;
        if (oVar != null) {
            try {
                bArr = oVar.f89471b;
                if (bArr == null) {
                    bArr = new byte[0];
                }
            } catch (Exception e10) {
                return v.a(new q(e10));
            }
        } else {
            bArr = new byte[0];
        }
        return v.c(bArr, m.e(oVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.s
    public void deliverResponse(@NotNull byte[] response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.onResponse.invoke(response);
    }
}
