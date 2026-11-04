package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.e0;
import okhttp3.x;
import okio.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class UploadRequestBody extends e0 {
    private static final int BUFFER_SIZE = 2048;

    @NotNull
    private final Context context;

    @NotNull
    private final MediaData.Media media;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UploadRequestBody(@NotNull Context context, @NotNull MediaData.Media media) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(media, "media");
        this.context = context;
        this.media = media;
    }

    @Override // okhttp3.e0
    public long contentLength() {
        return this.media.getSize();
    }

    @Override // okhttp3.e0
    @Nullable
    public x contentType() {
        return x.f334808e.d(this.media.getMimeType());
    }

    @Override // okhttp3.e0
    public void writeTo(@NotNull m sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(this.media.getUri());
        if (inputStreamOpenInputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i10 = inputStreamOpenInputStream.read(bArr);
                if (i10 == -1) {
                    Unit unit = Unit.f312394a;
                    c.a(inputStreamOpenInputStream, null);
                    return;
                }
                sink.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }
}
