package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class d implements x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41564f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f41566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final u0.e f41567e;

    public interface a {
        @Nullable
        Typeface a(@NotNull Context context, @NotNull d dVar);

        @Nullable
        Object b(@NotNull Context context, @NotNull d dVar, @NotNull kotlin.coroutines.d<? super Typeface> dVar2);
    }

    public /* synthetic */ d(int i10, a aVar, u0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, aVar, eVar);
    }

    @Override // androidx.compose.ui.text.font.x
    public final int b() {
        return this.f41565c;
    }

    @NotNull
    public final a d() {
        return this.f41566d;
    }

    @NotNull
    public final u0.e e() {
        return this.f41567e;
    }

    @kotlin.l(message = "Replaced with fontVariation constructor", replaceWith = @kotlin.b1(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ d(int i10, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, aVar);
    }

    private d(int i10, a aVar, u0.e eVar) {
        this.f41565c = i10;
        this.f41566d = aVar;
        this.f41567e = eVar;
    }

    private d(int i10, a aVar) {
        this(i10, aVar, new u0.e(new u0.a[0]), null);
    }
}
