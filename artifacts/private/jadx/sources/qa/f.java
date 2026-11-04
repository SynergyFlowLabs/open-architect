package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.imagechooser.m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public class f implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f350297c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f350298a = {"application/pdf"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f350299b;

    @Override // qa.e
    public boolean a() {
        return this.f350299b;
    }

    @Override // qa.e
    @m1
    @Nullable
    public Bitmap b(@NotNull Context context, @NotNull Uri input, @NotNull m options) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(options, "options");
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(input, "r");
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            try {
                try {
                    PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                    try {
                        if (pdfRenderer.getPageCount() > 0) {
                            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                            try {
                                double dC = ((double) options.c()) / ((double) Math.min(pageOpenPage.getWidth(), pageOpenPage.getHeight()));
                                Bitmap bitmapB = td.a.f380845a.b(kotlin.math.b.K0(((double) pageOpenPage.getWidth()) * dC), kotlin.math.b.K0(((double) pageOpenPage.getHeight()) * dC), Bitmap.Config.ARGB_8888);
                                bitmapB.eraseColor(-1);
                                pageOpenPage.render(bitmapB, null, null, 1);
                                kotlin.jdk7.a.c(pageOpenPage, null);
                                kotlin.jdk7.a.c(pdfRenderer, null);
                                kotlin.io.c.a(parcelFileDescriptorOpenFileDescriptor, null);
                                return bitmapB;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    kotlin.jdk7.a.c(pageOpenPage, th2);
                                    throw th3;
                                }
                            }
                        }
                        Unit unit = Unit.f312394a;
                        kotlin.jdk7.a.c(pdfRenderer, null);
                        kotlin.io.c.a(parcelFileDescriptorOpenFileDescriptor, null);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            kotlin.jdk7.a.c(pdfRenderer, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
                throw th6;
            } catch (Throwable th7) {
                kotlin.io.c.a(parcelFileDescriptorOpenFileDescriptor, th6);
                throw th7;
            }
        }
        return null;
    }

    @Override // qa.e
    @NotNull
    public String[] c() {
        return this.f350298a;
    }
}
