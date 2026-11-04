package com.planner5d.library.services;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.v1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f224375a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<b> f224376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<d> f224377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<c> f224378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<com.planner5d.library.widget.editor.editaction.e> f224379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<ItemRoom> f224380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<a> f224381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<ErrorMessageException> f224382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f224383i;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f224384c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f224385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Bundle f224386b;

        public a(@NotNull String activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f224385a = activity;
            this.f224386b = bundle;
        }

        @NotNull
        public final String a() {
            return this.f224385a;
        }

        @Nullable
        public final Bundle b() {
            return this.f224386b;
        }
    }

    @w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f224387c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final CatalogItem f224388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final ItemMaterialSet f224389b;

        public b(@NotNull CatalogItem item, @Nullable ItemMaterialSet itemMaterialSet) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f224388a = item;
            this.f224389b = itemMaterialSet;
        }

        @NotNull
        public final CatalogItem a() {
            return this.f224388a;
        }

        @Nullable
        public final ItemMaterialSet b() {
            return this.f224389b;
        }
    }

    @w0(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f224390d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.widget.editor.editaction.e f224391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final com.planner5d.library.widget.editor.editaction.e f224392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final c f224393c;

        public c(@NotNull com.planner5d.library.widget.editor.editaction.e forward, @Nullable com.planner5d.library.widget.editor.editaction.e eVar, @Nullable c cVar) {
            Intrinsics.checkNotNullParameter(forward, "forward");
            this.f224391a = forward;
            this.f224392b = eVar;
            this.f224393c = cVar;
        }

        @Nullable
        public final com.planner5d.library.widget.editor.editaction.e a() {
            return this.f224392b;
        }

        @NotNull
        public final com.planner5d.library.widget.editor.editaction.e b() {
            return this.f224391a;
        }

        @Nullable
        public final c c() {
            return this.f224393c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(@NotNull com.planner5d.library.widget.editor.editaction.e forward, @NotNull com.planner5d.library.widget.editor.editaction.e back) {
            this(forward, back, null);
            Intrinsics.checkNotNullParameter(forward, "forward");
            Intrinsics.checkNotNullParameter(back, "back");
        }
    }

    static {
        v1 v1Var = v1.f229769a;
        f224376b = v1Var.j(null);
        f224377c = v1.l(v1Var, null, 1, null);
        f224378d = v1.l(v1Var, null, 1, null);
        f224379e = v1.l(v1Var, null, 1, null);
        f224380f = v1.l(v1Var, null, 1, null);
        f224381g = v1.l(v1Var, null, 1, null);
        f224382h = v1.l(v1Var, null, 1, null);
        f224383i = 8;
    }

    private l() {
    }

    @w0(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f224394f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final ItemFloor f224395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f224396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final a f224397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Integer f224398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Integer f224399e;

        public enum a {
            SetActive,
            Add,
            Clone,
            Remove,
            Edit,
            PositionChange;


            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ kotlin.enums.a f224407h = kotlin.enums.c.c(k());

            static {
                int i10 = 1 & 2;
            }

            @NotNull
            public static kotlin.enums.a<a> l() {
                return f224407h;
            }
        }

        public d(@Nullable ItemFloor itemFloor, @Nullable String str, @NotNull a type, @Nullable Integer num, @Nullable Integer num2) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f224395a = itemFloor;
            this.f224396b = str;
            this.f224397c = type;
            this.f224398d = num;
            this.f224399e = num2;
        }

        @Nullable
        public final Integer a() {
            return this.f224399e;
        }

        @Nullable
        public final ItemFloor b() {
            return this.f224395a;
        }

        @Nullable
        public final Integer c() {
            return this.f224398d;
        }

        @Nullable
        public final String d() {
            return this.f224396b;
        }

        @NotNull
        public final a e() {
            return this.f224397c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(@Nullable ItemFloor itemFloor, @Nullable String str, @NotNull a type) {
            this(itemFloor, str, type, null, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }
}
