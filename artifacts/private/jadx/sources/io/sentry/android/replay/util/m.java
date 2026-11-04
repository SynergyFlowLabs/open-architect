package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.w0;
import io.sentry.n8;
import io.sentry.p4;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e.b(26)
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Persistable.kt\nio/sentry/android/replay/util/PersistableLinkedList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class m extends ConcurrentLinkedDeque<io.sentry.rrweb.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f305030e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f305032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f305033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<io.sentry.android.replay.j> f305034d;

    public m(@NotNull String propertyName, @NotNull n8 options, @NotNull ScheduledExecutorService persistingExecutor, @NotNull Function0<io.sentry.android.replay.j> cacheProvider) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        this.f305031a = propertyName;
        this.f305032b = options;
        this.f305033c = persistingExecutor;
        this.f305034d = cacheProvider;
    }

    private final void l() throws Exception {
        final io.sentry.android.replay.j jVarInvoke = this.f305034d.invoke();
        if (jVarInvoke == null) {
            return;
        }
        final p4 p4Var = new p4();
        p4Var.c(new ArrayList(this));
        if (this.f305032b.getThreadChecker().a()) {
            this.f305033c.submit(new Runnable() { // from class: io.sentry.android.replay.util.l
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    m.m(this.f305027a, p4Var, jVarInvoke);
                }
            });
            return;
        }
        StringWriter stringWriter = new StringWriter();
        this.f305032b.getSerializer().a(p4Var, new BufferedWriter(stringWriter));
        jVarInvoke.x(this.f305031a, stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(m mVar, p4 p4Var, io.sentry.android.replay.j jVar) throws Exception {
        StringWriter stringWriter = new StringWriter();
        mVar.f305032b.getSerializer().a(p4Var, new BufferedWriter(stringWriter));
        jVar.x(mVar.f305031a, stringWriter.toString());
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean addAll(@NotNull Collection<? extends io.sentry.rrweb.b> elements) throws Exception {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zAddAll = super.addAll(elements);
        l();
        return zAddAll;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof io.sentry.rrweb.b) {
            return i((io.sentry.rrweb.b) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull io.sentry.rrweb.b element) throws Exception {
        Intrinsics.checkNotNullParameter(element, "element");
        boolean zAdd = super.add(element);
        l();
        return zAdd;
    }

    public /* bridge */ boolean i(io.sentry.rrweb.b bVar) {
        return super.contains(bVar);
    }

    public /* bridge */ int k() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque, java.util.Queue
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public io.sentry.rrweb.b remove() throws Exception {
        io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) super.remove();
        l();
        Intrinsics.checkNotNull(bVar);
        return bVar;
    }

    public /* bridge */ boolean p(io.sentry.rrweb.b bVar) {
        return super.remove(bVar);
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ int size() {
        return k();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof io.sentry.rrweb.b) {
            return p((io.sentry.rrweb.b) obj);
        }
        return false;
    }
}
