package com.planner5d.library.model.manager.config.purchaseplacement;

import com.planner5d.library.services.r;
import fd.e;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f181612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f181613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f181614c;

    public enum a {
        ai_chat("ai_chat"),
        ai_decorator("design_generator"),
        ai_designer("ai_designer"),
        ai_designer_b("ai_designer_b"),
        ai_renders("ai_renders"),
        ai_smart_wizard_a("ai_smart_wizard_a"),
        ai_smart_wizard_b("ai_smart_wizard_b"),
        compare_plans_premium("compare_plans_premium"),
        compare_plans_pro("compare_plans_pro"),
        deeplink("deeplink"),
        editing("editing"),
        export_to_cad("export_to_cad"),
        fallback("fallback"),
        locked_edit("locked_edit"),
        locked_item("locked_item"),
        locked_item_gift("locked_item_gift"),
        locked_save("locked_save"),
        menu_catalog("menu_catalog"),
        onboarding("onboarding"),
        plan_recognitions("plan_recognitions"),
        pro_4k_render("4k_render"),
        profile("profile"),
        snapshots("snapshots"),
        textures("textures"),
        unknown("unknown"),
        upload_plan("upload_plan");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f181640a;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f181627j3 = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1578a f181615b = new C1578a(null);

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.purchaseplacement.b$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nPurchasePlacement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePlacement.kt\ncom/planner5d/library/model/manager/config/purchaseplacement/PurchasePlacement$Name$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
        public static final class C1578a {
            public /* synthetic */ C1578a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final a a(@NotNull String name) {
                a next;
                Intrinsics.checkNotNullParameter(name, "name");
                Iterator<a> it = a.l().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(next.n(), name)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private C1578a() {
            }
        }

        a(String str) {
            this.f181640a = str;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f181627j3;
        }

        @NotNull
        public final String n() {
            return this.f181640a;
        }
    }

    public b(@NotNull a name, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f181612a = name;
        this.f181613b = str;
        this.f181614c = str2;
    }

    @Nullable
    public final e a() {
        return e.f275119b.a(this.f181614c);
    }

    @Nullable
    public final String b() {
        return this.f181614c;
    }

    @Nullable
    public final e c() {
        return e.f275119b.a(this.f181613b);
    }

    @Nullable
    public final String d() {
        return this.f181613b;
    }

    @NotNull
    public final a e() {
        return this.f181612a;
    }

    public final boolean f() {
        return e.f275119b.b(this.f181613b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull a name, @NotNull JSONObject json) {
        this(name, json.getString(r.layout.f224891a), json.optString(r.fallback.f224891a));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(json, "json");
    }
}
