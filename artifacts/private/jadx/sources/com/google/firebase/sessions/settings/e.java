package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.superwall.sdk.network.Api;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public final class e implements com.google.firebase.sessions.settings.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f125110c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f125111d = "firebase-settings.crashlytics.com";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f125112e = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.sessions.b f125113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f125114b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s, 75, 78}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRemoteSettingsFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n216#2,2:106\n1#3:108\n*S KotlinDebug\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n*L\n58#1:106,2\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125115a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f125117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<JSONObject, kotlin.coroutines.d<? super Unit>, Object> f125118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<String, kotlin.coroutines.d<? super Unit>, Object> f125119e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, Function2<? super JSONObject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Function2<? super String, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f125117c = map;
            this.f125118d = function2;
            this.f125119e = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f125117c, this.f125118d, this.f125119e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
        
            if (r9.invoke(r1, r8) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
        
            if (r1.invoke(r3, r8) == r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e(@NotNull com.google.firebase.sessions.b appInfo, @d8.b @NotNull CoroutineContext blockingDispatcher) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.f125113a = appInfo;
        this.f125114b = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme(Api.scheme).authority(f125111d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f125113a.j()).appendPath("settings").appendQueryParameter("build_version", this.f125113a.i().i()).appendQueryParameter("display_version", this.f125113a.i().n()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.a
    @Nullable
    public Object a(@NotNull Map<String, String> map, @NotNull Function2<? super JSONObject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function2<? super String, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f125114b, new b(map, function2, function3, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
