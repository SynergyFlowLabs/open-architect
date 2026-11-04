package com.google.firebase.sessions.api;

import androidx.annotation.l1;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.g;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nFirebaseSessionsDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,100:1\n462#2:101\n412#2:102\n1246#3,2:103\n1249#3:116\n116#4,11:105\n*S KotlinDebug\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n*L\n75#1:101\n75#1:102\n75#1:103,2\n75#1:116\n76#1:105,11\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f124853a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<c.a, a> f124854b = Collections.synchronizedMap(new LinkedHashMap());

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.sync.a f124855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private c f124856b;

        public a(@NotNull kotlinx.coroutines.sync.a mutex, @Nullable c cVar) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.f124855a = mutex;
            this.f124856b = cVar;
        }

        public static /* synthetic */ a d(a aVar, kotlinx.coroutines.sync.a aVar2, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f124855a;
            }
            if ((i10 & 2) != 0) {
                cVar = aVar.f124856b;
            }
            return aVar.c(aVar2, cVar);
        }

        @NotNull
        public final kotlinx.coroutines.sync.a a() {
            return this.f124855a;
        }

        @Nullable
        public final c b() {
            return this.f124856b;
        }

        @NotNull
        public final a c(@NotNull kotlinx.coroutines.sync.a mutex, @Nullable c cVar) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            return new a(mutex, cVar);
        }

        @NotNull
        public final kotlinx.coroutines.sync.a e() {
            return this.f124855a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f124855a, aVar.f124855a) && Intrinsics.areEqual(this.f124856b, aVar.f124856b);
        }

        @Nullable
        public final c f() {
            return this.f124856b;
        }

        public final void g(@Nullable c cVar) {
            this.f124856b = cVar;
        }

        public int hashCode() {
            int iHashCode = this.f124855a.hashCode() * 31;
            c cVar = this.f124856b;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "Dependency(mutex=" + this.f124855a + ", subscriber=" + this.f124856b + ')';
        }

        public /* synthetic */ a(kotlinx.coroutines.sync.a aVar, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? null : cVar);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.api.b$b, reason: collision with other inner class name */
    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", i = {0, 0, 0}, l = {110}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$3"})
    static final class C1187b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f124857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f124858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f124859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f124860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f124861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f124862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f124863g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f124865i;

        C1187b(kotlin.coroutines.d<? super C1187b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f124863g = obj;
            this.f124865i |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    public static final void a(@NotNull c.a subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        Map<c.a, a> dependencies = f124854b;
        if (dependencies.containsKey(subscriberName)) {
            Objects.toString(subscriberName);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new a(g.a(true), null, 2, 0 == true ? 1 : 0));
        Objects.toString(subscriberName);
    }

    private final a b(c.a aVar) {
        Map<c.a, a> dependencies = f124854b;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        a aVar2 = dependencies.get(aVar);
        if (aVar2 != null) {
            Intrinsics.checkNotNullExpressionValue(aVar2, "getOrElse(...)");
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    @n
    public static final void e(@NotNull c subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        c.a aVarB = subscriber.b();
        a aVarB2 = f124853a.b(aVarB);
        if (aVarB2.f() != null) {
            Objects.toString(aVarB);
            return;
        }
        aVarB2.g(subscriber);
        Objects.toString(aVarB);
        kotlinx.coroutines.sync.a.C2318a.d(aVarB2.e(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00be -> B:27:0x00bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.Map<com.google.firebase.sessions.api.c.a, ? extends com.google.firebase.sessions.api.c>> r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.b.c(kotlin.coroutines.d):java.lang.Object");
    }

    @l1
    @NotNull
    public final c d(@NotNull c.a subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        c cVarF = b(subscriberName).f();
        if (cVarF != null) {
            return cVarF;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    @l1
    public final void f() {
        f124854b.clear();
    }
}
