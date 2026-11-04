package androidx.activity.compose;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class b<I> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9794b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.activity.result.h<I> f9795a;

    @Nullable
    public final androidx.activity.result.h<I> a() {
        return this.f9795a;
    }

    public final void b(I i10, @Nullable androidx.core.app.e eVar) {
        Unit unit;
        androidx.activity.result.h<I> hVar = this.f9795a;
        if (hVar != null) {
            hVar.c(i10, eVar);
            unit = Unit.f312394a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void c(@Nullable androidx.activity.result.h<I> hVar) {
        this.f9795a = hVar;
    }

    public final void d() {
        Unit unit;
        androidx.activity.result.h<I> hVar = this.f9795a;
        if (hVar != null) {
            hVar.d();
            unit = Unit.f312394a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
