package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@w0(29)
@b1({b1.a.LIBRARY_GROUP})
public class f0 extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47798d = "TypefaceCompatApi29Impl";

    private Font p(@NonNull FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iR = r(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iR2 = r(fontStyle, font2.getStyle());
            if (iR2 < iR) {
                font = font2;
                iR = iR2;
            }
        }
        return font;
    }

    @p0
    private static FontFamily q(@p0 CancellationSignal cancellationSignal, @NonNull androidx.core.provider.h.c[] cVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (androidx.core.provider.h.c cVar : cVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    private static int r(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.g0
    @p0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (androidx.core.content.res.f.e eVar : dVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, eVar.b()).setWeight(eVar.e()).setSlant(eVar.f() ? 1 : 0).setTtcIndex(eVar.c()).setFontVariationSettings(eVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(p(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.g0
    @p0
    public Typeface d(Context context, @p0 CancellationSignal cancellationSignal, @NonNull androidx.core.provider.h.c[] cVarArr, int i10) {
        try {
            FontFamily fontFamilyQ = q(cancellationSignal, cVarArr, context.getContentResolver());
            if (fontFamilyQ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyQ).setStyle(p(fontFamilyQ, i10).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.g0
    @p0
    public Typeface e(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull List<androidx.core.provider.h.c[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyQ = q(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyQ);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyQ2 = q(cancellationSignal, list.get(i11), contentResolver);
                if (fontFamilyQ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyQ2);
                }
            }
            return customFallbackBuilder.setStyle(p(fontFamilyQ, i10).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.g0
    protected Typeface f(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.g0
    @p0
    public Typeface g(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.g0
    @NonNull
    Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // androidx.core.graphics.g0
    protected androidx.core.provider.h.c m(androidx.core.provider.h.c[] cVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
