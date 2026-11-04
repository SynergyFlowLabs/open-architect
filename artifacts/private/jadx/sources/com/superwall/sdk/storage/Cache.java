package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.storage.memory.LRUCache;
import com.superwall.sdk.storage.memory.PerpetualCache;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.io.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Cache implements s0 {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String appSpecificDocumentDirectoryPrefix = "com.superwall.document.appSpecific.Store";

    @NotNull
    private static final String cacheDirectoryPrefix = "com.superwall.cache.Store";
    private static final long defaultMaxCachePeriodInSecond = 604800;

    @NotNull
    private static final String ioQueuePrefix = "com.superwall.queue.Store";

    @NotNull
    private static final String userSpecificDocumentDirectoryPrefix = "com.superwall.document.userSpecific.Store";
    private final /* synthetic */ s0 $$delegate_0;

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineContext ioQueue;

    @NotNull
    private final Json json;

    @NotNull
    private final LRUCache<String, Object> memCache;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.Cache$delete$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.storage.Cache$delete$1", f = "Cache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\ncom/superwall/sdk/storage/Cache$delete$1\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,119:1\n136#2,10:120\n*S KotlinDebug\n*F\n+ 1 Cache.kt\ncom/superwall/sdk/storage/Cache$delete$1\n*L\n87#1:120,10\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Storable<T> $storable;
        int label;
        final /* synthetic */ Cache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Storable<T> storable, Cache cache, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$storable = storable;
            this.this$0 = cache;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$storable, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Storable<T> storable = this.$storable;
            try {
                try {
                    File file = storable.file(this.this$0.getContext());
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.cache, "Unable to delete key: " + storable.getKey(), null, th2, 8, null);
                }
                new Either.Success(Unit.f312394a);
            } catch (Throwable th3) {
                if (ErrorTrackingKt.shouldLog(th3)) {
                    Superwall.Companion companion = Superwall.Companion;
                    if (companion.getInitialized()) {
                        ErrorTrackingKt.trackError(companion.getInstance(), th3);
                    }
                }
                new Either.Failure(th3);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.Cache$write$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.Cache$write$1", f = "Cache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27251 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ T $data;
        final /* synthetic */ Storable<T> $storable;
        int label;
        final /* synthetic */ Cache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27251(Storable<T> storable, Cache cache, T t10, d<? super C27251> dVar) {
            super(2, dVar);
            this.$storable = storable;
            this.this$0 = cache;
            this.$data = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27251(this.$storable, this.this$0, this.$data, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                l.H(this.$storable.file(this.this$0.getContext()), this.this$0.json.encodeToString(this.$storable.getSerializer(), this.$data), Charsets.UTF_8);
            } catch (Throwable th2) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.cache, "Unable to write key: " + this.$storable.getKey(), null, th2, 8, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27251) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public Cache(@NotNull Context context, @NotNull CoroutineContext ioQueue, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioQueue, "ioQueue");
        Intrinsics.checkNotNullParameter(json, "json");
        this.$$delegate_0 = t0.a(ioQueue);
        this.context = context;
        this.ioQueue = ioQueue;
        this.json = json;
        this.memCache = new LRUCache<>(new PerpetualCache(), 1000);
    }

    private final void cleanDiskCache() {
    }

    public final void clean() {
        this.memCache.clear();
        cleanDiskCache();
    }

    public final <T> void delete(@NotNull Storable<T> storable) {
        Intrinsics.checkNotNullParameter(storable, "storable");
        this.memCache.remove(storable.getKey());
        int i10 = 0 >> 0;
        k.f(this, null, null, new AnonymousClass1(storable, this, null), 3, null);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final <T> T read(@NotNull Storable<T> storable) {
        Intrinsics.checkNotNullParameter(storable, "storable");
        Object obj = this.memCache.get(storable.getKey());
        if (obj == null) {
            obj = null;
        }
        T t10 = (T) obj;
        if (t10 == null) {
            File file = storable.file(this.context);
            if (file.exists()) {
                String strA = "";
                try {
                    strA = l.A(file, Charsets.UTF_8);
                    t10 = (T) this.json.decodeFromString(storable.getSerializer(), strA);
                    if (t10 == null) {
                        return t10;
                    }
                    this.memCache.set(storable.getKey(), t10);
                    Unit unit = Unit.f312394a;
                    return t10;
                } catch (Throwable th2) {
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.cache, "Unable to read key: " + storable.getKey() + ", got " + strA, null, th2, 8, null);
                    Unit unit2 = Unit.f312394a;
                }
            }
        }
        return t10;
    }

    public final <T> void write(@NotNull Storable<T> storable, @NotNull T data) {
        Intrinsics.checkNotNullParameter(storable, "storable");
        Intrinsics.checkNotNullParameter(data, "data");
        this.memCache.set(storable.getKey(), data);
        k.f(this, null, null, new C27251(storable, this, data, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Cache(Context context, CoroutineContext coroutineContext, Json json, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            int i11 = 0 << 0;
            coroutineContext = n0.d0(l1.c(), 1, null, 2, null);
        }
        this(context, coroutineContext, json);
    }
}
