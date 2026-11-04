package com.planner5d.library.util.navigation.uistate;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.core.content.d;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.q;
import androidx.navigation.n0;
import androidx.navigation.q3;
import androidx.navigation.v3;
import androidx.navigation.w2;
import androidx.navigation.y1;
import com.planner5d.library.services.utility.k3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@q3.b("fragment")
public final class c extends q3<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f244800d;

    @SourceDebugExtension({"SMAP\nUiStateFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiStateFragmentNavigator.kt\ncom/planner5d/library/util/navigation/uistate/UiStateFragmentNavigator$Destination\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,101:1\n1#2:102\n1#2:104\n228#3:103\n*S KotlinDebug\n*F\n+ 1 UiStateFragmentNavigator.kt\ncom/planner5d/library/util/navigation/uistate/UiStateFragmentNavigator$Destination\n*L\n51#1:104\n51#1:103\n*E\n"})
    public static final class a extends q.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f244801i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private String f244802j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f244803k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f244804l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f244805m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @l
        private int f244806n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f244807o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f244808s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull c navigator) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f244803k = true;
            this.f244805m = true;
            this.f244806n = -1;
        }

        public final boolean A0() {
            return this.f244801i;
        }

        public final boolean D0() {
            return this.f244808s;
        }

        @Nullable
        public final k3 E0(@Nullable Bundle bundle) {
            String str = this.f244802j;
            if (str != null) {
                Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt(str)) : null;
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        return new k3(numValueOf.intValue(), new Object[0]);
                    }
                }
            }
            return null;
        }

        @Nullable
        public final String F0() {
            return this.f244802j;
        }

        public final boolean G0() {
            return this.f244807o;
        }

        public final int I0() {
            return this.f244806n;
        }

        public final boolean J0() {
            return this.f244805m;
        }

        public final boolean K0() {
            return this.f244804l;
        }

        public final boolean L0() {
            return this.f244803k;
        }

        @Override // androidx.navigation.fragment.q.c, androidx.navigation.y1
        public void a0(@NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.a0(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, com.planner5d.library.util.navigation.l.s.MH);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
            this.f244801i = typedArrayObtainAttributes.getBoolean(com.planner5d.library.util.navigation.l.s.NH, this.f244801i);
            this.f244802j = typedArrayObtainAttributes.getString(com.planner5d.library.util.navigation.l.s.PH);
            this.f244803k = typedArrayObtainAttributes.getBoolean(com.planner5d.library.util.navigation.l.s.UH, this.f244803k);
            this.f244804l = typedArrayObtainAttributes.getBoolean(com.planner5d.library.util.navigation.l.s.TH, this.f244804l);
            this.f244805m = typedArrayObtainAttributes.getBoolean(com.planner5d.library.util.navigation.l.s.SH, this.f244805m);
            this.f244806n = typedArrayObtainAttributes.getColor(com.planner5d.library.util.navigation.l.s.RH, d.g(context, com.planner5d.library.util.navigation.l.e.Ol));
            this.f244807o = typedArrayObtainAttributes.getBoolean(com.planner5d.library.util.navigation.l.s.QH, context.getResources().getBoolean(com.planner5d.library.util.navigation.l.d.f240915l));
            this.f244808s = typedArrayObtainAttributes.getBoolean(com.planner5d.library.util.navigation.l.s.OH, this.f244808s);
            Unit unit = Unit.f312394a;
            typedArrayObtainAttributes.recycle();
        }
    }

    public c(@NotNull Context context, @NotNull FragmentManager fragmentManager, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f244800d = new q(context, fragmentManager, i10);
    }

    @Override // androidx.navigation.q3
    public void h(@NotNull List<n0> entries, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f244800d.h(entries, w2Var, aVar);
    }

    @Override // androidx.navigation.q3
    @e.a({"MissingSuperCall"})
    public void j(@NotNull v3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f244800d.j(state);
    }

    @Override // androidx.navigation.q3
    public void k(@NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        this.f244800d.k(backStackEntry);
    }

    @Override // androidx.navigation.q3
    public void m(@NotNull Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        this.f244800d.m(savedState);
    }

    @Override // androidx.navigation.q3
    @Nullable
    public Bundle n() {
        return this.f244800d.n();
    }

    @Override // androidx.navigation.q3
    public void o(@NotNull n0 popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        this.f244800d.o(popUpTo, z10);
    }

    @Override // androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a c() {
        return new a(this);
    }

    @Override // androidx.navigation.q3
    @Nullable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public y1 g(@NotNull a destination, @Nullable Bundle bundle, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return this.f244800d.g(destination, bundle, w2Var, aVar);
    }
}
