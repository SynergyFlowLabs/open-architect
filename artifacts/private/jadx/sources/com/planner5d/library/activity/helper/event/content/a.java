package com.planner5d.library.activity.helper.event.content;

import android.os.Bundle;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.k3;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nContentRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentRequest.kt\ncom/planner5d/library/activity/helper/event/content/ContentRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends FragmentController> f136783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Bundle f136784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final k3 f136785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final k3 f136786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final a f136787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final e f136788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136789g;

    public a(@NotNull Class<? extends FragmentController> fragmentClass, @Nullable Bundle bundle, @Nullable k3 k3Var, @Nullable k3 k3Var2, @Nullable a aVar, @NotNull e animation, boolean z10) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f136783a = fragmentClass;
        this.f136784b = bundle;
        this.f136785c = k3Var;
        this.f136786d = k3Var2;
        this.f136787e = aVar;
        this.f136788f = animation;
        this.f136789g = z10;
    }

    @NotNull
    public final Bundle a() {
        i iVarH = new i().t(r.fragmentTitle, this.f136785c).t(r.fragmentSubtitle, this.f136786d).j(r.fragmentClass, this.f136783a.getCanonicalName()).h(r.fragmentArguments, this.f136784b);
        r rVar = r.previous;
        a aVar = this.f136787e;
        return iVarH.h(rVar, aVar != null ? aVar.a() : null).a();
    }

    @NotNull
    public final e b() {
        return this.f136788f;
    }

    public final boolean c() {
        return this.f136789g;
    }

    @Nullable
    public final Bundle d() {
        return this.f136784b;
    }

    @NotNull
    public final Class<? extends FragmentController> e() {
        return this.f136783a;
    }

    @Nullable
    public final k3 f() {
        return this.f136786d;
    }

    @Nullable
    public final k3 g() {
        return this.f136785c;
    }

    @Nullable
    public final a h() {
        return this.f136787e;
    }

    @Nullable
    public final a i(@NotNull Class<? extends FragmentController> target) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (Intrinsics.areEqual(this.f136783a, target)) {
            return this;
        }
        a aVar = this.f136787e;
        if (aVar != null) {
            return aVar.i(target);
        }
        return null;
    }

    public final void j(boolean z10) {
        this.f136789g = z10;
    }

    public final boolean k(@NotNull Function1<? super i, Unit> updater) {
        Intrinsics.checkNotNullParameter(updater, "updater");
        if (this.f136784b == null) {
            return false;
        }
        i iVar = new i();
        iVar.s(this.f136784b);
        updater.invoke(iVar);
        Bundle bundle = this.f136784b;
        bundle.clear();
        bundle.putAll(iVar.a());
        return true;
    }

    @NotNull
    public String toString() {
        return "ContentRequest(fragmentClass=" + this.f136783a + ", fragmentArguments=" + this.f136784b + ", fragmentTitle=" + this.f136785c + ", previous=" + this.f136787e + ")";
    }

    public /* synthetic */ a(Class cls, Bundle bundle, k3 k3Var, k3 k3Var2, a aVar, e eVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i10 & 2) != 0 ? null : bundle, k3Var, k3Var2, aVar, (i10 & 32) != 0 ? e.None : eVar, (i10 & 64) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Bundle state) {
        this(new j(state));
        Intrinsics.checkNotNullParameter(state, "state");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NotNull j parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        String strT = parser.t(r.fragmentClass, com.planner5d.library.model.payments.a.f222474i);
        if (strT != null) {
            try {
                Class<?> cls = Class.forName(strT);
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out com.planner5d.library.activity.fragment.FragmentController>");
                Bundle bundleH = parser.h(r.fragmentArguments, null);
                Serializable serializableS = parser.s(r.fragmentTitle, null);
                k3 k3Var = serializableS instanceof k3 ? (k3) serializableS : null;
                Serializable serializableS2 = parser.s(r.fragmentSubtitle, null);
                k3 k3Var2 = serializableS2 instanceof k3 ? (k3) serializableS2 : null;
                Bundle bundleH2 = parser.h(r.previous, null);
                this(cls, bundleH, k3Var, k3Var2, bundleH2 != null ? new a(bundleH2) : null, null, false, 96, null);
                return;
            } catch (Throwable unused) {
                throw new RuntimeException("Could not load class: " + strT);
            }
        }
        throw new RuntimeException("Could not load fragment class: null");
    }
}
