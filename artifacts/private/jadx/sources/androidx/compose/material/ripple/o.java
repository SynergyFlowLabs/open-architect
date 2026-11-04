package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class o extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24814f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<s> f24816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<s> f24817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f24818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24819e;

    public o(@NotNull Context context) {
        super(context);
        this.f24815a = 5;
        ArrayList arrayList = new ArrayList();
        this.f24816b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f24817c = arrayList2;
        this.f24818d = new q();
        setClipChildren(false);
        s sVar = new s(context);
        addView(sVar);
        arrayList.add(sVar);
        arrayList2.add(sVar);
        this.f24819e = 1;
        setTag(d0.b.J, Boolean.TRUE);
    }

    public final void a(@NotNull p pVar) {
        pVar.u7();
        s sVarB = this.f24818d.b(pVar);
        if (sVarB != null) {
            sVarB.d();
            this.f24818d.c(pVar);
            this.f24817c.add(sVarB);
        }
    }

    @NotNull
    public final s b(@NotNull p pVar) {
        s sVarB = this.f24818d.b(pVar);
        if (sVarB != null) {
            return sVarB;
        }
        s sVar = (s) CollectionsKt.removeFirstOrNull(this.f24817c);
        if (sVar == null) {
            if (this.f24819e > CollectionsKt.getLastIndex(this.f24816b)) {
                sVar = new s(getContext());
                addView(sVar);
                this.f24816b.add(sVar);
            } else {
                sVar = this.f24816b.get(this.f24819e);
                p pVarA = this.f24818d.a(sVar);
                if (pVarA != null) {
                    pVarA.u7();
                    this.f24818d.c(pVarA);
                    sVar.d();
                }
            }
            int i10 = this.f24819e;
            if (i10 < this.f24815a - 1) {
                this.f24819e = i10 + 1;
            } else {
                this.f24819e = 0;
            }
        }
        this.f24818d.d(pVar, sVar);
        return sVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
