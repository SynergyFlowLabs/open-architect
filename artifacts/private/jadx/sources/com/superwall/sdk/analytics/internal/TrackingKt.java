package com.superwall.sdk.analytics.internal;

import androidx.core.app.w;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import com.superwall.sdk.analytics.superwall.SuperwallEventInfo;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.FeatureFlags;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.storage.DisableVerboseEvents;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import okhttp3.internal.ws.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tracking.kt\ncom/superwall/sdk/analytics/internal/TrackingKt\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,205:1\n136#2,10:206\n122#3,4:216\n*S KotlinDebug\n*F\n+ 1 Tracking.kt\ncom/superwall/sdk/analytics/internal/TrackingKt\n*L\n40#1:206,10\n115#1:216,4\n*E\n"})
public final class TrackingKt {

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.internal.TrackingKt$handleImplicitTrigger$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.analytics.internal.TrackingKt$handleImplicitTrigger$2", f = "Tracking.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Trackable $event;
        final /* synthetic */ EventData $eventData;
        final /* synthetic */ Superwall $this_handleImplicitTrigger;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.analytics.internal.TrackingKt$handleImplicitTrigger$2$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.analytics.internal.TrackingKt$handleImplicitTrigger$2$1", f = "Tracking.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function1<d<? super Unit>, Object> {
            final /* synthetic */ Trackable $event;
            final /* synthetic */ EventData $eventData;
            final /* synthetic */ Superwall $this_handleImplicitTrigger;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Superwall superwall, Trackable trackable, EventData eventData, d<? super AnonymousClass1> dVar) {
                super(1, dVar);
                this.$this_handleImplicitTrigger = superwall;
                this.$event = trackable;
                this.$eventData = eventData;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(d<?> dVar) {
                return new AnonymousClass1(this.$this_handleImplicitTrigger, this.$event, this.$eventData, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = b.l();
                int i10 = this.label;
                int i11 = 7 << 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Superwall superwall = this.$this_handleImplicitTrigger;
                    Trackable trackable = this.$event;
                    EventData eventData = this.$eventData;
                    this.label = 1;
                    if (TrackingKt.internallyHandleImplicitTrigger(superwall, trackable, eventData, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(d<? super Unit> dVar) {
                return ((AnonymousClass1) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Superwall superwall, Trackable trackable, EventData eventData, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_handleImplicitTrigger = superwall;
            this.$event = trackable;
            this.$eventData = eventData;
            int i10 = 2 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$this_handleImplicitTrigger, this.$event, this.$eventData, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.$this_handleImplicitTrigger.getSerialTaskManager$superwall_release().addTask(new AnonymousClass1(this.$this_handleImplicitTrigger, this.$event, this.$eventData, null));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.internal.TrackingKt$internallyHandleImplicitTrigger$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.analytics.internal.TrackingKt$internallyHandleImplicitTrigger$2", f = "Tracking.kt", i = {0, 2, 2, 3, 3, 4, 4}, l = {160, 162, 178, 183, 185, 202}, m = "invokeSuspend", n = {"request", "request", "statePublisher", "request", "lastPresentationItems", "request", "lastPresentationItems"}, s = {"L$2", "L$1", "L$2", "L$1", "L$2", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tracking.kt\ncom/superwall/sdk/analytics/internal/TrackingKt$internallyHandleImplicitTrigger$2\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,205:1\n136#2,10:206\n*S KotlinDebug\n*F\n+ 1 Tracking.kt\ncom/superwall/sdk/analytics/internal/TrackingKt$internallyHandleImplicitTrigger$2\n*L\n149#1:206,10\n*E\n"})
    static final class C26222 extends o implements Function2<s0, d<? super Either<? extends Unit, Throwable>>, Object> {
        final /* synthetic */ Trackable $event;
        final /* synthetic */ EventData $eventData;
        final /* synthetic */ Superwall $this_internallyHandleImplicitTrigger;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26222(EventData eventData, Superwall superwall, Trackable trackable, d<? super C26222> dVar) {
            super(2, dVar);
            this.$eventData = eventData;
            this.$this_internallyHandleImplicitTrigger = superwall;
            this.$event = trackable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26222(this.$eventData, this.$this_internallyHandleImplicitTrigger, this.$event, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super Either<? extends Unit, Throwable>> dVar) {
            return invoke2(s0Var, (d<? super Either<Unit, Throwable>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d2 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e7 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ef A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fb A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:42:0x010a  */
        /* JADX WARN: Code duplicated, block: B:43:0x010b A[Catch: all -> 0x0172, PHI: r0 r1 r2 r3
          0x010b: PHI (r0v26 java.lang.Object) = (r0v14 java.lang.Object), (r0v34 java.lang.Object) binds: [B:41:0x0108, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x010b: PHI (r1v14 com.superwall.sdk.paywall.presentation.internal.PresentationRequest) = 
          (r1v8 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
          (r1v16 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
         binds: [B:41:0x0108, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x010b: PHI (r2v12 com.superwall.sdk.Superwall) = (r2v6 com.superwall.sdk.Superwall), (r2v14 com.superwall.sdk.Superwall) binds: [B:41:0x0108, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x010b: PHI (r3v6 com.superwall.sdk.paywall.presentation.LastPresentationItems) = 
          (r3v5 com.superwall.sdk.paywall.presentation.LastPresentationItems)
          (r3v7 com.superwall.sdk.paywall.presentation.LastPresentationItems)
         binds: [B:41:0x0108, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0111 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0120  */
        /* JADX WARN: Code duplicated, block: B:48:0x0121  */
        /* JADX WARN: Code duplicated, block: B:50:0x0127 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0138 A[Catch: all -> 0x0172, PHI: r1 r2 r4
          0x0138: PHI (r1v17 com.superwall.sdk.paywall.presentation.internal.PresentationRequest) = 
          (r1v8 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
          (r1v8 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
          (r1v11 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
          (r1v18 com.superwall.sdk.paywall.presentation.internal.PresentationRequest)
         binds: [B:51:0x012d, B:53:0x0135, B:34:0x00e5, B:49:0x0122] A[DONT_GENERATE, DONT_INLINE]
          0x0138: PHI (r2v15 com.superwall.sdk.Superwall) = 
          (r2v6 com.superwall.sdk.Superwall)
          (r2v6 com.superwall.sdk.Superwall)
          (r2v9 com.superwall.sdk.Superwall)
          (r2v16 com.superwall.sdk.Superwall)
         binds: [B:51:0x012d, B:53:0x0135, B:34:0x00e5, B:49:0x0122] A[DONT_GENERATE, DONT_INLINE]
          0x0138: PHI (r4v11 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>) = 
          (r4v8 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>)
          (r4v8 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>)
          (r4v10 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>)
          (r4v12 kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState>)
         binds: [B:51:0x012d, B:53:0x0135, B:34:0x00e5, B:49:0x0122] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0172, blocks: (B:6:0x0017, B:63:0x016a, B:9:0x0028, B:49:0x0122, B:55:0x0138, B:12:0x0039, B:43:0x010b, B:45:0x0111, B:15:0x004d, B:28:0x00a4, B:30:0x00d2, B:35:0x00e7, B:37:0x00ef, B:40:0x00fb, B:50:0x0127, B:52:0x012f, B:60:0x015a, B:23:0x006f), top: B:73:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0152  */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0167, code lost:
        
            if (com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt.logErrors(r2, r1, r0, r23) == r8) goto L62;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 416
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.analytics.internal.TrackingKt.C26222.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, d<? super Either<Unit, Throwable>> dVar) {
            return ((C26222) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.internal.TrackingKt$track$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.analytics.internal.TrackingKt", f = "Tracking.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "track", n = {"$this$track", w.I0, "$this$track", w.I0, "eventCreatedAt"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objTrack = TrackingKt.track(null, null, this);
            return objTrack == b.l() ? objTrack : Result.a(objTrack);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.internal.TrackingKt$trackSync$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.analytics.internal.TrackingKt$trackSync$1", f = "Tracking.kt", i = {}, l = {g.f334652s}, m = "invokeSuspend", n = {}, s = {})
    static final class C26231 extends o implements Function2<s0, d<? super Result<? extends TrackingResult>>, Object> {
        final /* synthetic */ Trackable $event;
        final /* synthetic */ Superwall $this_trackSync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26231(Superwall superwall, Trackable trackable, d<? super C26231> dVar) {
            super(2, dVar);
            this.$this_trackSync = superwall;
            this.$event = trackable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26231(this.$this_trackSync, this.$event, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super Result<? extends TrackingResult>> dVar) {
            return invoke2(s0Var, (d<? super Result<TrackingResult>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objTrack;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = this.$this_trackSync;
                Trackable trackable = this.$event;
                this.label = 1;
                objTrack = TrackingKt.track(superwall, trackable, this);
                if (objTrack == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                objTrack = ((Result) obj).j();
            }
            return Result.a(objTrack);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, d<? super Result<TrackingResult>> dVar) {
            return ((C26231) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object handleImplicitTrigger(@NotNull Superwall superwall, @NotNull Trackable trackable, @NotNull EventData eventData, @NotNull d<? super Unit> dVar) {
        Object objH = i.h(l1.e(), new AnonymousClass2(superwall, trackable, eventData, null), dVar);
        return objH == b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object internallyHandleImplicitTrigger(Superwall superwall, Trackable trackable, EventData eventData, d<? super Either<Unit, Throwable>> dVar) {
        return i.h(l1.e(), new C26222(eventData, superwall, trackable, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:13:0x0038, B:28:0x0099, B:30:0x009f, B:31:0x00d2, B:33:0x00f1, B:35:0x00f7, B:37:0x0102, B:40:0x0116, B:42:0x0126, B:43:0x0131, B:45:0x0146, B:46:0x015a, B:18:0x004d, B:24:0x006e, B:21:0x0057), top: B:64:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:42:0x0126 A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:13:0x0038, B:28:0x0099, B:30:0x009f, B:31:0x00d2, B:33:0x00f1, B:35:0x00f7, B:37:0x0102, B:40:0x0116, B:42:0x0126, B:43:0x0131, B:45:0x0146, B:46:0x015a, B:18:0x004d, B:24:0x006e, B:21:0x0057), top: B:64:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0146 A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:13:0x0038, B:28:0x0099, B:30:0x009f, B:31:0x00d2, B:33:0x00f1, B:35:0x00f7, B:37:0x0102, B:40:0x0116, B:42:0x0126, B:43:0x0131, B:45:0x0146, B:46:0x015a, B:18:0x004d, B:24:0x006e, B:21:0x0057), top: B:64:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Code duplicated, block: B:58:0x0193  */
    /* JADX WARN: Code duplicated, block: B:60:0x0197  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object track(@NotNull Superwall superwall, @NotNull Trackable trackable, @NotNull d<? super Result<TrackingResult>> dVar) {
        AnonymousClass1 anonymousClass1;
        Either failure;
        Superwall superwall2;
        Trackable trackable2;
        Date date;
        Superwall superwall3;
        Trackable trackable3;
        TrackingParameters trackingParameters;
        EventData eventData;
        Config config;
        Boolean boolA;
        Boolean bool;
        FeatureFlags featureFlags;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<Boolean> hasInitialized = Superwall.Companion.getHasInitialized();
                superwall2 = superwall;
                anonymousClass1.L$0 = superwall2;
                trackable2 = trackable;
                anonymousClass1.L$1 = trackable2;
                anonymousClass1.label = 1;
                if (k.w0(hasInitialized, anonymousClass1) == objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                Trackable trackable4 = (Trackable) anonymousClass1.L$1;
                Superwall superwall4 = (Superwall) anonymousClass1.L$0;
                ResultKt.m(obj);
                trackable2 = trackable4;
                superwall2 = superwall4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Date date2 = (Date) anonymousClass1.L$2;
                trackable3 = (Trackable) anonymousClass1.L$1;
                superwall3 = (Superwall) anonymousClass1.L$0;
                ResultKt.m(obj);
                date = date2;
            }
            trackingParameters = (TrackingParameters) obj;
            if (trackable3 instanceof TrackableSuperwallEvent) {
                SuperwallEventInfo superwallEventInfo = new SuperwallEventInfo(((TrackableSuperwallEvent) trackable3).getSuperwallPlacement(), trackingParameters.getDelegateParams());
                superwall3.getDependencyContainer$superwall_release().getDelegateAdapter().handleSuperwallEvent(superwallEventInfo);
                superwall3.emitSuperwallEvent$superwall_release(superwallEventInfo);
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.placements, "Logged Event", trackingParameters.getAudienceFilterParams(), null, 16, null);
            }
            eventData = new EventData((String) null, trackable3.getRawName(), trackingParameters.getAudienceFilterParams(), date, 1, (DefaultConstructorMarker) null);
            config = superwall3.getDependencyContainer$superwall_release().getConfigManager().getConfig();
            if (config != null || (featureFlags = config.getFeatureFlags()) == null) {
                boolA = null;
            } else {
                boolA = kotlin.coroutines.jvm.internal.b.a(featureFlags.getDisableVerboseEvents());
            }
            bool = (Boolean) superwall3.getDependencyContainer$superwall_release().getStorage().read(DisableVerboseEvents.INSTANCE);
            if (boolA == null) {
                boolA = bool;
            }
            if (TrackingLogic.Companion.isNotDisabledVerboseEvent(trackable3, boolA, superwall3.getDependencyContainer$superwall_release().makeIsSandbox())) {
                superwall3.getDependencyContainer$superwall_release().getEventsQueue().enqueue(eventData, trackable3);
            }
            CoreDataManager.saveEventData$default(superwall3.getDependencyContainer$superwall_release().getStorage().getCoreDataManager(), eventData, null, 2, null);
            if (trackable3.getCanImplicitlyTriggerPaywall()) {
                kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new TrackingKt$track$2$1(trackable3, eventData, null), 3, null);
            }
            failure = new Either.Success(new TrackingResult(eventData, trackingParameters));
            if (failure instanceof Either.Success) {
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(((Either.Success) failure).getValue());
            }
            if (failure instanceof Either.Failure) {
                throw new k0();
            }
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
            Date date3 = new Date();
            TrackingLogic.Companion companion = TrackingLogic.Companion;
            String id2 = superwall2.getDependencyContainer$superwall_release().getAppSessionManager().getAppSession().getId();
            anonymousClass1.L$0 = superwall2;
            anonymousClass1.L$1 = trackable2;
            anonymousClass1.L$2 = date3;
            anonymousClass1.label = 2;
            Object objProcessParameters = companion.processParameters(trackable2, id2, anonymousClass1);
            if (objProcessParameters != objL) {
                date = date3;
                obj = objProcessParameters;
                superwall3 = superwall2;
                trackable3 = trackable2;
                trackingParameters = (TrackingParameters) obj;
                if (trackable3 instanceof TrackableSuperwallEvent) {
                    SuperwallEventInfo superwallEventInfo2 = new SuperwallEventInfo(((TrackableSuperwallEvent) trackable3).getSuperwallPlacement(), trackingParameters.getDelegateParams());
                    superwall3.getDependencyContainer$superwall_release().getDelegateAdapter().handleSuperwallEvent(superwallEventInfo2);
                    superwall3.emitSuperwallEvent$superwall_release(superwallEventInfo2);
                    Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.placements, "Logged Event", trackingParameters.getAudienceFilterParams(), null, 16, null);
                }
                eventData = new EventData((String) null, trackable3.getRawName(), trackingParameters.getAudienceFilterParams(), date, 1, (DefaultConstructorMarker) null);
                config = superwall3.getDependencyContainer$superwall_release().getConfigManager().getConfig();
                if (config != null) {
                    boolA = null;
                } else {
                    boolA = null;
                }
                bool = (Boolean) superwall3.getDependencyContainer$superwall_release().getStorage().read(DisableVerboseEvents.INSTANCE);
                if (boolA == null) {
                    boolA = bool;
                }
                if (TrackingLogic.Companion.isNotDisabledVerboseEvent(trackable3, boolA, superwall3.getDependencyContainer$superwall_release().makeIsSandbox())) {
                    superwall3.getDependencyContainer$superwall_release().getEventsQueue().enqueue(eventData, trackable3);
                }
                CoreDataManager.saveEventData$default(superwall3.getDependencyContainer$superwall_release().getStorage().getCoreDataManager(), eventData, null, 2, null);
                if (trackable3.getCanImplicitlyTriggerPaywall()) {
                    kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new TrackingKt$track$2$1(trackable3, eventData, null), 3, null);
                }
                failure = new Either.Success(new TrackingResult(eventData, trackingParameters));
                if (failure instanceof Either.Success) {
                    Result.a aVar3 = Result.Companion;
                    return Result.m785constructorimpl(((Either.Success) failure).getValue());
                }
                if (failure instanceof Either.Failure) {
                    throw new k0();
                }
                Result.a aVar4 = Result.Companion;
                return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
            }
            return objL;
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion2 = Superwall.Companion;
                if (companion2.getInitialized()) {
                    ErrorTrackingKt.trackError(companion2.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
    }

    @NotNull
    public static final Object trackSync(@NotNull Superwall superwall, @NotNull Trackable event) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        return ((Result) j.b(null, new C26231(superwall, event, null), 1, null)).j();
    }
}
