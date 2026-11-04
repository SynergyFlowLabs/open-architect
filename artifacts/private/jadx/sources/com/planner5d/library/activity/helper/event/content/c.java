package com.planner5d.library.activity.helper.event.content;

import android.os.Bundle;
import androidx.annotation.f1;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.k3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Class<? extends FragmentController> f136795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private i f136796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private k3 f136797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private k3 f136798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private a f136799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private e f136800f;

    public c() {
        this.f136800f = e.None;
        this.f136795a = FragmentController.class;
        this.f136796b = new i();
    }

    @NotNull
    public final c a(@NotNull Bundle arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f136796b.s(arguments);
        return this;
    }

    @l(message = "We will replace with Navigation component")
    @NotNull
    public final a b() {
        return new a(this.f136795a, this.f136796b.a(), this.f136797c, this.f136798d, this.f136799e, this.f136800f, false, 64, null);
    }

    @NotNull
    protected final e c() {
        return this.f136800f;
    }

    @NotNull
    protected final i d() {
        return this.f136796b;
    }

    @NotNull
    protected final Class<? extends FragmentController> e() {
        return this.f136795a;
    }

    @Nullable
    protected final a f() {
        return this.f136799e;
    }

    protected final void g(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f136800f = eVar;
    }

    protected final void h(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f136796b = iVar;
    }

    protected final void i(@NotNull Class<? extends FragmentController> cls) {
        Intrinsics.checkNotNullParameter(cls, "<set-?>");
        this.f136795a = cls;
    }

    @NotNull
    public final c j(@Nullable a aVar) {
        this.f136799e = aVar;
        return this;
    }

    @NotNull
    public final c k(@NotNull c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return j(builder.b());
    }

    protected final void l(@Nullable a aVar) {
        this.f136799e = aVar;
    }

    @NotNull
    public final c m(@f1 int i10) {
        this.f136798d = new k3(i10, new Object[0]);
        return this;
    }

    @NotNull
    public final c n(@f1 int i10) {
        this.f136797c = new k3(i10, new Object[0]);
        return this;
    }

    @NotNull
    public final c o(@Nullable k3 k3Var) {
        this.f136797c = k3Var;
        return this;
    }

    @NotNull
    public final c p(@Nullable String str) {
        this.f136797c = str != null ? new k3(str) : null;
        return this;
    }

    @NotNull
    public String toString() {
        return "Destination(fragmentClass=" + this.f136795a + ", fragmentArguments=" + this.f136796b + ", fragmentTitle=" + this.f136797c + ", previous=" + this.f136799e + ")";
    }

    public c(@NotNull a request, @NotNull e animation) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f136800f = e.None;
        this.f136795a = request.e();
        this.f136796b = new i(request.d());
        this.f136797c = request.g();
        this.f136799e = request.h();
        this.f136800f = animation;
    }

    public c(@NotNull a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f136800f = e.None;
        this.f136795a = request.e();
        this.f136796b = new i(request.d());
        this.f136797c = request.g();
        this.f136799e = request.h();
        this.f136800f = request.b().l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Bundle state) {
        this(new a(state));
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public c(@NotNull Class<? extends FragmentController> fragmentClass, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        this.f136800f = e.None;
        this.f136795a = fragmentClass;
        this.f136796b = new i(bundle);
    }

    public /* synthetic */ c(Class cls, Bundle bundle, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, bundle, (i10 & 4) != 0 ? e.None : eVar);
    }

    public c(@NotNull Class<? extends FragmentController> fragmentClass, @Nullable Bundle bundle, @NotNull e animation) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f136800f = e.None;
        this.f136795a = fragmentClass;
        this.f136796b = new i(bundle);
        this.f136800f = animation;
    }
}
