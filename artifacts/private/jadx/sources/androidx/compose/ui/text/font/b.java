package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(26)
public final class b extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41555n = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final ParcelFileDescriptor f41556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final String f41557m;

    public /* synthetic */ b(ParcelFileDescriptor parcelFileDescriptor, v0 v0Var, int i10, u0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, v0Var, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.k
    @Nullable
    public Typeface f(@Nullable Context context) {
        return o1.f41681a.c(this.f41556l, context, e());
    }

    @Override // androidx.compose.ui.text.font.k
    @Nullable
    public String g() {
        return this.f41557m;
    }

    @NotNull
    public final ParcelFileDescriptor k() {
        return this.f41556l;
    }

    @NotNull
    public String toString() {
        return "Font(fileDescriptor=" + this.f41556l + ", weight=" + a() + ", style=" + ((Object) q0.i(c())) + ')';
    }

    public /* synthetic */ b(ParcelFileDescriptor parcelFileDescriptor, v0 v0Var, int i10, u0.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, (i11 & 2) != 0 ? v0.f41742b.m() : v0Var, (i11 & 4) != 0 ? q0.f41690b.c() : i10, eVar, null);
    }

    private b(ParcelFileDescriptor parcelFileDescriptor, v0 v0Var, int i10, u0.e eVar) {
        super(v0Var, i10, eVar, null);
        this.f41556l = parcelFileDescriptor;
        j(f(null));
    }
}
