package le;

import android.graphics.pdf.PdfDocument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface l {

    public interface a {
        void a(@Nullable String str);

        void onError(@NotNull Throwable th2);
    }

    void a(@NotNull PdfDocument pdfDocument, @NotNull a aVar);
}
