package com.planner5d.library.model.manager.config;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f181421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final EnumSet<EnumC1573a> f181422b;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.a$a, reason: collision with other inner class name */
    public enum EnumC1573a {
        NATIVE("native"),
        SUPERWALL("superwall");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f181428a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f181427f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1574a f181423b = new C1574a(null);

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.a$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAllowedProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllowedProduct.kt\ncom/planner5d/library/model/manager/config/AllowedProduct$TargetBackend$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
        public static final class C1574a {
            public /* synthetic */ C1574a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final EnumC1573a a(@NotNull String code) {
                EnumC1573a next;
                Intrinsics.checkNotNullParameter(code, "code");
                Iterator<EnumC1573a> it = EnumC1573a.n().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(next.f181428a, code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private C1574a() {
            }
        }

        EnumC1573a(String str) {
            this.f181428a = str;
        }

        @NotNull
        public static kotlin.enums.a<EnumC1573a> n() {
            return f181427f;
        }
    }

    public a(@NotNull String productName, @Nullable EnumSet<EnumC1573a> enumSet) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f181421a = productName;
        this.f181422b = enumSet;
    }

    @NotNull
    public final String a() {
        return this.f181421a;
    }

    public final boolean b(@NotNull String productName, @NotNull EnumC1573a targetBackend) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        if (!Intrinsics.areEqual(productName, this.f181421a)) {
            return false;
        }
        EnumSet<EnumC1573a> enumSet = this.f181422b;
        return enumSet == null || enumSet.isEmpty() || this.f181422b.contains(targetBackend);
    }
}
