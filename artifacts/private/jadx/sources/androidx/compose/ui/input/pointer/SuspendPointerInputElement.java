package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class SuspendPointerInputElement extends e1<z0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f38964g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Object f38965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Object f38966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Object[] f38967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final PointerInputEventHandler f38968f;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.areEqual(this.f38965c, suspendPointerInputElement.f38965c) || !Intrinsics.areEqual(this.f38966d, suspendPointerInputElement.f38966d)) {
            return false;
        }
        Object[] objArr = this.f38967e;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f38967e;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f38967e != null) {
            return false;
        }
        return this.f38968f == suspendPointerInputElement.f38968f;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        Object obj = this.f38965c;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f38966d;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f38967e;
        return ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + this.f38968f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("pointerInput");
        t2Var.b().c("key1", this.f38965c);
        t2Var.b().c("key2", this.f38966d);
        t2Var.b().c(com.google.firebase.crashlytics.internal.metadata.p.f121327i, this.f38967e);
        t2Var.b().c("pointerInputEventHandler", this.f38968f);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public z0 a() {
        return new z0(this.f38965c, this.f38966d, this.f38967e, this.f38968f);
    }

    @Nullable
    public final Object m() {
        return this.f38965c;
    }

    @Nullable
    public final Object n() {
        return this.f38966d;
    }

    @Nullable
    public final Object[] o() {
        return this.f38967e;
    }

    @NotNull
    public final PointerInputEventHandler p() {
        return this.f38968f;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull z0 z0Var) {
        z0Var.C9(this.f38965c, this.f38966d, this.f38967e, this.f38968f);
    }

    public SuspendPointerInputElement(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        this.f38965c = obj;
        this.f38966d = obj2;
        this.f38967e = objArr;
        this.f38968f = pointerInputEventHandler;
    }
}
