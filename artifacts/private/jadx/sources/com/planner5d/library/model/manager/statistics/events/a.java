package com.planner5d.library.model.manager.statistics.events;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.statistics.events.a$a, reason: collision with other inner class name */
    public interface InterfaceC1626a extends a {
        boolean k();

        @Nullable
        String l();
    }

    @oj.g
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f216675a;

        private /* synthetic */ b(String str) {
            this.f216675a = str;
        }

        public static final /* synthetic */ b a(String str) {
            return new b(str);
        }

        @NotNull
        public static String b(@NotNull String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return eventName;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof b) && Intrinsics.areEqual(str, ((b) obj).g());
        }

        public static final boolean d(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        public static int e(String str) {
            return str.hashCode();
        }

        public static String f(String str) {
            return "RawValueBased(eventName=" + str + ")";
        }

        public boolean equals(Object obj) {
            return c(this.f216675a, obj);
        }

        public final /* synthetic */ String g() {
            return this.f216675a;
        }

        public int hashCode() {
            return e(this.f216675a);
        }

        @Override // com.planner5d.library.model.manager.statistics.events.a
        @NotNull
        public String n() {
            return this.f216675a;
        }

        public String toString() {
            return f(this.f216675a);
        }
    }

    @NotNull
    String n();
}
