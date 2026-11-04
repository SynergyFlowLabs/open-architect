package io.customer.messaginginapp.gist.data.listeners;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AppsFlyerProperties;
import ih.e;
import io.customer.messaginginapp.di.DIGraphMessagingInAppKt;
import io.customer.messaginginapp.gist.data.NetworkUtilities;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.state.InAppMessagingAction;
import io.customer.messaginginapp.state.InAppMessagingManager;
import io.customer.messaginginapp.state.InAppMessagingState;
import io.customer.messaginginapp.store.InAppPreferenceStore;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.u;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Queue.kt\nio/customer/messaginginapp/gist/data/listeners/Queue\n+ 2 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,195:1\n563#2:196\n*S KotlinDebug\n*F\n+ 1 Queue.kt\nio/customer/messaginginapp/gist/data/listeners/Queue\n*L\n68#1:196\n*E\n"})
public final class Queue implements GistQueue {

    @NotNull
    private final f0 cache$delegate;

    @NotNull
    private final f0 cacheDirectory$delegate;
    private final int cacheSize;

    @NotNull
    private final f0 gistQueueService$delegate;

    @NotNull
    private final InAppMessagingManager inAppMessagingManager;

    @NotNull
    private final e logger;

    @NotNull
    private final s0 scope;

    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.data.listeners.Queue$fetchUserMessages$1, reason: invalid class name */
    @f(c = "io.customer.messaginginapp.gist.data.listeners.Queue$fetchUserMessages$1", f = "Queue.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Queue.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            AnonymousClass1 anonymousClass1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    try {
                        e.a.a(Queue.this.logger, "Fetching user messages", null, 2, null);
                        if (Queue.this.getState().getUserId() == null) {
                            e.a.a(Queue.this.logger, "User not set, skipping fetch", null, 2, null);
                            return Unit.f312394a;
                        }
                        GistQueueService gistQueueService = Queue.this.getGistQueueService();
                        String sessionId = Queue.this.getState().getSessionId();
                        this.label = 1;
                        anonymousClass1 = this;
                        try {
                            obj = GistQueueService.DefaultImpls.fetchMessagesForUser$default(gistQueueService, null, sessionId, anonymousClass1, 1, null);
                            if (obj == objL) {
                                return objL;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            e.a.a(Queue.this.logger, "Error fetching messages: " + exc.getMessage(), null, 2, null);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        anonymousClass1 = this;
                        exc = e;
                        e.a.a(Queue.this.logger, "Error fetching messages: " + exc.getMessage(), null, 2, null);
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    anonymousClass1 = this;
                }
                Response response = (Response) obj;
                int iCode = response.code();
                if (iCode == 204 || iCode == 304) {
                    Queue.this.handleNoContent(iCode);
                } else if (response.isSuccessful()) {
                    Queue.this.handleSuccessfulFetch((List) response.body());
                } else {
                    Queue.this.handleFailedFetch(iCode);
                }
                Queue queue = Queue.this;
                u uVarHeaders = response.headers();
                Intrinsics.checkNotNullExpressionValue(uVarHeaders, "headers(...)");
                queue.updatePollingInterval(uVarHeaders);
            } catch (Exception e12) {
                exc = e12;
                anonymousClass1 = this;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.data.listeners.Queue$logView$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.customer.messaginginapp.gist.data.listeners.Queue$logView$1", f = "Queue.kt", i = {}, l = {185, 187}, m = "invokeSuspend", n = {}, s = {})
    static final class C27671 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Message $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27671(Message message, d<? super C27671> dVar) {
            super(2, dVar);
            this.$message = message;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Queue.this.new C27671(this.$message, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        
            if (r8 == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v11 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 0
                int r1 = r8.label
                r2 = 1
                r7 = r2
                r3 = 0
                r4 = 2
                if (r1 == 0) goto L23
                if (r1 == r2) goto L11
                if (r1 != r4) goto L18
            L11:
                kotlin.ResultKt.m(r9)     // Catch: java.lang.Exception -> L16
                goto Lb4
            L16:
                r9 = move-exception
                goto L93
            L18:
                r7 = 4
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "/rswnrok/ioneeti  svhouoemfl/ / lerb/tc ce/ atoi/e/"
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L23:
                r7 = 2
                kotlin.ResultKt.m(r9)
                io.customer.messaginginapp.gist.data.listeners.Queue r9 = io.customer.messaginginapp.gist.data.listeners.Queue.this     // Catch: java.lang.Exception -> L16
                ih.e r9 = io.customer.messaginginapp.gist.data.listeners.Queue.access$getLogger$p(r9)     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.gist.data.model.Message r1 = r8.$message     // Catch: java.lang.Exception -> L16
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
                r5.<init>()     // Catch: java.lang.Exception -> L16
                java.lang.String r6 = "Logging view for message: "
                r5.append(r6)     // Catch: java.lang.Exception -> L16
                r7 = 7
                r5.append(r1)     // Catch: java.lang.Exception -> L16
                java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L16
                ih.e.a.a(r9, r1, r3, r4, r3)     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.gist.data.model.Message r9 = r8.$message     // Catch: java.lang.Exception -> L16
                java.lang.String r9 = r9.getQueueId()     // Catch: java.lang.Exception -> L16
                if (r9 == 0) goto L6d
                io.customer.messaginginapp.gist.data.listeners.Queue r9 = io.customer.messaginginapp.gist.data.listeners.Queue.this     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.gist.data.listeners.GistQueueService r9 = io.customer.messaginginapp.gist.data.listeners.Queue.access$getGistQueueService(r9)     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.gist.data.model.Message r1 = r8.$message     // Catch: java.lang.Exception -> L16
                java.lang.String r1 = r1.getQueueId()     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.gist.data.listeners.Queue r5 = io.customer.messaginginapp.gist.data.listeners.Queue.this     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.state.InAppMessagingState r5 = io.customer.messaginginapp.gist.data.listeners.Queue.access$getState(r5)     // Catch: java.lang.Exception -> L16
                java.lang.String r5 = r5.getSessionId()     // Catch: java.lang.Exception -> L16
                r8.label = r2     // Catch: java.lang.Exception -> L16
                r7 = 5
                java.lang.Object r8 = r9.logUserMessageView(r1, r5, r8)     // Catch: java.lang.Exception -> L16
                r7 = 5
                if (r8 != r0) goto Lb4
                goto L91
            L6d:
                r7 = 2
                io.customer.messaginginapp.gist.data.listeners.Queue r9 = io.customer.messaginginapp.gist.data.listeners.Queue.this     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.gist.data.listeners.GistQueueService r9 = io.customer.messaginginapp.gist.data.listeners.Queue.access$getGistQueueService(r9)     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.gist.data.model.Message r1 = r8.$message     // Catch: java.lang.Exception -> L16
                r7 = 6
                java.lang.String r1 = r1.getMessageId()     // Catch: java.lang.Exception -> L16
                r7 = 5
                io.customer.messaginginapp.gist.data.listeners.Queue r2 = io.customer.messaginginapp.gist.data.listeners.Queue.this     // Catch: java.lang.Exception -> L16
                io.customer.messaginginapp.state.InAppMessagingState r2 = io.customer.messaginginapp.gist.data.listeners.Queue.access$getState(r2)     // Catch: java.lang.Exception -> L16
                r7 = 3
                java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L16
                r7 = 2
                r8.label = r4     // Catch: java.lang.Exception -> L16
                r7 = 0
                java.lang.Object r8 = r9.logMessageView(r1, r2, r8)     // Catch: java.lang.Exception -> L16
                if (r8 != r0) goto Lb4
            L91:
                r7 = 3
                return r0
            L93:
                io.customer.messaginginapp.gist.data.listeners.Queue r8 = io.customer.messaginginapp.gist.data.listeners.Queue.this
                r7 = 7
                ih.e r8 = io.customer.messaginginapp.gist.data.listeners.Queue.access$getLogger$p(r8)
                java.lang.String r9 = r9.getMessage()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r7 = 5
                java.lang.String r1 = "Failed to log message view: "
                r7 = 5
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                ih.e.a.a(r8, r9, r3, r4, r3)
            Lb4:
                r7 = 2
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.customer.messaginginapp.gist.data.listeners.Queue.C27671.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27671) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public Queue() {
        eh.d dVar = eh.d.f274883c;
        this.inAppMessagingManager = DIGraphMessagingInAppKt.getInAppMessagingManager(dVar);
        this.logger = dVar.w();
        this.scope = dVar.y().c();
        this.cacheSize = com.google.api.client.googleapis.media.c.B;
        this.cacheDirectory$delegate = g0.c(new Function0() { // from class: io.customer.messaginginapp.gist.data.listeners.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Queue.cacheDirectory_delegate$lambda$0(this.f288348a);
            }
        });
        this.cache$delegate = g0.c(new Function0() { // from class: io.customer.messaginginapp.gist.data.listeners.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Queue.cache_delegate$lambda$1(this.f288349a);
            }
        });
        this.gistQueueService$delegate = g0.c(new Function0() { // from class: io.customer.messaginginapp.gist.data.listeners.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f288350a.createGistQueueService();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File cacheDirectory_delegate$lambda$0(Queue queue) {
        return new File(queue.getApplication().getCacheDir(), AppsFlyerProperties.HTTP_CACHE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.c cache_delegate$lambda$1(Queue queue) {
        return new okhttp3.c(queue.getCacheDirectory(), queue.cacheSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GistQueueService createGistQueueService() {
        Object objCreate = new Retrofit.Builder().baseUrl(getState().getEnvironment().getGistQueueApiUrl()).addConverterFactory(GsonConverterFactory.create()).client(new b0.a().g(getCache()).c(new w() { // from class: io.customer.messaginginapp.gist.data.listeners.Queue$createGistQueueService$$inlined$-addInterceptor$1
            @Override // okhttp3.w
            @NotNull
            public final okhttp3.f0 intercept(@NotNull w.a chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                d0 d0VarRequest = chain.request();
                d0.a aVarA = d0VarRequest.n().a(NetworkUtilities.CIO_SITE_ID_HEADER, this.this$0.getState().getSiteId()).a(NetworkUtilities.CIO_DATACENTER_HEADER, this.this$0.getState().getDataCenter());
                eh.d dVar = eh.d.f274883c;
                String lowerCase = dVar.q().u().b().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                d0.a aVarA2 = aVarA.a(NetworkUtilities.CIO_CLIENT_PLATFORM, lowerCase + "-android").a(NetworkUtilities.CIO_CLIENT_VERSION, dVar.q().u().a());
                String userId = this.this$0.getState().getUserId();
                if (userId != null) {
                    byte[] bytes = userId.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    String strEncodeToString = Base64.encodeToString(bytes, 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
                    aVarA2.a(NetworkUtilities.USER_TOKEN_HEADER, strEncodeToString);
                }
                return this.this$0.interceptResponse(chain.c(aVarA2.n(com.google.common.net.d.f119471a, io.ktor.client.utils.d.f295392f).b()), d0VarRequest);
            }
        }).f()).build().create(GistQueueService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (GistQueueService) objCreate;
    }

    private final Context getApplication() {
        return eh.d.f274883c.q().r();
    }

    private final okhttp3.c getCache() {
        return (okhttp3.c) this.cache$delegate.getValue();
    }

    private final File getCacheDirectory() {
        return (File) this.cacheDirectory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GistQueueService getGistQueueService() {
        return (GistQueueService) this.gistQueueService$delegate.getValue();
    }

    private final InAppPreferenceStore getInAppPreferenceStore() {
        return DIGraphMessagingInAppKt.getInAppPreferenceStore(eh.d.f274883c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InAppMessagingState getState() {
        return this.inAppMessagingManager.getCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFailedFetch(int i10) {
        e.a.b(this.logger, "Failed to fetch messages: " + i10, null, null, 6, null);
        this.inAppMessagingManager.dispatch(InAppMessagingAction.ClearMessageQueue.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNoContent(int i10) {
        e.a.a(this.logger, "No messages found for user with response code: " + i10, null, 2, null);
        this.inAppMessagingManager.dispatch(InAppMessagingAction.ClearMessageQueue.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessfulFetch(List<Message> list) {
        e.a.a(this.logger, "Found " + (list != null ? Integer.valueOf(list.size()) : null) + " messages for user", null, 2, null);
        if (list != null) {
            this.inAppMessagingManager.dispatch(new InAppMessagingAction.ProcessMessageQueue(list));
        }
    }

    private final okhttp3.f0 interceptNotModifiedResponse(okhttp3.f0 f0Var, d0 d0Var) {
        okhttp3.f0 f0VarC;
        String networkResponse = getInAppPreferenceStore().getNetworkResponse(d0Var.q().toString());
        return (networkResponse == null || (f0VarC = f0Var.j0().b(okhttp3.g0.Companion.a(networkResponse, null)).g(200).c()) == null) ? f0Var : f0VarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final okhttp3.f0 interceptResponse(okhttp3.f0 f0Var, d0 d0Var) {
        int iE = f0Var.E();
        if (iE != 200) {
            return iE != 304 ? f0Var : interceptNotModifiedResponse(f0Var, d0Var);
        }
        return interceptSuccessfulResponse(f0Var, d0Var);
    }

    private final okhttp3.f0 interceptSuccessfulResponse(okhttp3.f0 f0Var, d0 d0Var) throws IOException {
        okhttp3.g0 g0VarR = f0Var.r();
        if (g0VarR == null) {
            return f0Var;
        }
        String strString = g0VarR.string();
        getInAppPreferenceStore().saveNetworkResponse(d0Var.q().toString(), strString);
        return f0Var.j0().b(okhttp3.g0.Companion.a(strString, g0VarR.contentType())).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePollingInterval(u uVar) {
        Integer intOrNull;
        int iIntValue;
        String strK = uVar.k("X-Gist-Queue-Polling-Interval");
        if (strK == null || (intOrNull = StringsKt.toIntOrNull(strK)) == null || (iIntValue = intOrNull.intValue()) <= 0) {
            return;
        }
        long j10 = iIntValue * 1000;
        if (j10 != getState().getPollInterval()) {
            e.a.a(this.logger, "Polling interval changed to: " + iIntValue + " seconds", null, 2, null);
            this.inAppMessagingManager.dispatch(new InAppMessagingAction.SetPollingInterval(j10));
        }
    }

    @Override // io.customer.messaginginapp.gist.data.listeners.GistQueue
    public void fetchUserMessages() {
        k.f(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // io.customer.messaginginapp.gist.data.listeners.GistQueue
    public void logView(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        k.f(this.scope, null, null, new C27671(message, null), 3, null);
    }
}
