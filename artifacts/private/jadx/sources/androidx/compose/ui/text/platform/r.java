package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.collection.f3;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.font.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@kotlin.l(message = "Duplicate cache")
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n1#1,174:1\n1#2:175\n251#3,2:176\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n*L\n142#1:176,2\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f42104a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f3<String, Typeface> f42105b = new f3<>(16, 16, null, null, null, 28, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42106c = 8;

    private r() {
    }

    private final String a(Context context, androidx.compose.ui.text.font.x xVar) {
        if (!(xVar instanceof l1)) {
            if (xVar instanceof androidx.compose.ui.text.font.k) {
                return ((androidx.compose.ui.text.font.k) xVar).g();
            }
            throw new IllegalArgumentException("Unknown font type: " + xVar);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((l1) xVar).i(), typedValue, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("res:");
        CharSequence charSequence = typedValue.string;
        String string = charSequence != null ? charSequence.toString() : null;
        Intrinsics.checkNotNull(string);
        sb2.append(string);
        return sb2.toString();
    }

    @NotNull
    public final Typeface b(@NotNull Context context, @NotNull androidx.compose.ui.text.font.x xVar) {
        Typeface typefaceA;
        Typeface typefaceV;
        String strA = a(context, xVar);
        if (strA != null && (typefaceV = f42105b.v(strA)) != null) {
            return typefaceV;
        }
        if (xVar instanceof l1) {
            typefaceA = k.f42090a.a(context, ((l1) xVar).i());
        } else {
            if (!(xVar instanceof androidx.compose.ui.text.font.d)) {
                throw new IllegalArgumentException("Unknown font type: " + xVar);
            }
            androidx.compose.ui.text.font.d dVar = (androidx.compose.ui.text.font.d) xVar;
            typefaceA = dVar.d().a(context, dVar);
        }
        if (typefaceA != null) {
            if (strA != null) {
                f42105b.Z(strA, typefaceA);
            }
            return typefaceA;
        }
        throw new IllegalArgumentException("Unable to load font " + xVar);
    }
}
