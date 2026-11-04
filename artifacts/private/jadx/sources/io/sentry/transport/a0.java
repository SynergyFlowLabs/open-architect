package io.sentry.transport;

import io.sentry.g6;
import io.sentry.m1;
import io.sentry.m7;
import io.sentry.n0;
import io.sentry.n8;
import io.sentry.util.h0;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f306847g = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f306848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f306849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<io.sentry.o, Date> f306850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<b> f306851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Timer f306852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f306853f;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a0.this.q();
        }
    }

    public interface b {
        void o(@NotNull a0 a0Var);
    }

    public a0(@NotNull p pVar, @NotNull n8 n8Var) {
        this.f306850c = new ConcurrentHashMap();
        this.f306851d = new CopyOnWriteArrayList();
        int i10 = 2 | 0;
        this.f306852e = null;
        this.f306853f = new io.sentry.util.a();
        this.f306848a = pVar;
        this.f306849b = n8Var;
    }

    public static /* synthetic */ void c(a0 a0Var, io.sentry.hints.f fVar) {
        a0Var.getClass();
        fVar.a();
        a0Var.f306849b.getLogger().c(y7.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    private void f(@NotNull io.sentry.o oVar, @NotNull Date date) {
        Date date2 = this.f306850c.get(oVar);
        if (date2 == null || date.after(date2)) {
            this.f306850c.put(oVar, date);
            q();
            m1 m1VarA = this.f306853f.a();
            try {
                if (this.f306852e == null) {
                    this.f306852e = new Timer(true);
                }
                this.f306852e.schedule(new a(), date);
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @NotNull
    private List<io.sentry.o> h(@NotNull String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return Collections.singletonList(io.sentry.o.Attachment);
            case "replay_video":
                return Collections.singletonList(io.sentry.o.Replay);
            case "profile_chunk":
                return Arrays.asList(io.sentry.o.ProfileChunkUi, io.sentry.o.ProfileChunk);
            case "profile":
                return Collections.singletonList(io.sentry.o.Profile);
            case "feedback":
                return Collections.singletonList(io.sentry.o.Feedback);
            case "log":
                return Collections.singletonList(io.sentry.o.LogItem);
            case "event":
                return Collections.singletonList(io.sentry.o.Error);
            case "check_in":
                return Collections.singletonList(io.sentry.o.Monitor);
            case "session":
                return Collections.singletonList(io.sentry.o.Session);
            case "transaction":
                return Collections.singletonList(io.sentry.o.Transaction);
            default:
                return Collections.singletonList(io.sentry.o.Unknown);
        }
    }

    private boolean m(@NotNull String str) {
        Iterator<io.sentry.o> it = h(str).iterator();
        while (it.hasNext()) {
            if (j(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void o(@NotNull n0 n0Var, final boolean z10) {
        io.sentry.util.n.k(n0Var, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).d(false);
            }
        });
        io.sentry.util.n.k(n0Var, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).e(z10);
            }
        });
        io.sentry.util.n.k(n0Var, io.sentry.hints.f.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.z
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                a0.c(this.f306906a, (io.sentry.hints.f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Iterator<b> it = this.f306851d.iterator();
        while (it.hasNext()) {
            it.next().o(this);
        }
    }

    private long r(@Nullable String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m1 m1VarA = this.f306853f.a();
        try {
            Timer timer = this.f306852e;
            if (timer != null) {
                timer.cancel();
                this.f306852e = null;
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
            this.f306851d.clear();
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void e(@NotNull b bVar) {
        this.f306851d.add(bVar);
    }

    @Nullable
    public g6 g(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        ArrayList arrayList = null;
        for (m7 m7Var : g6Var.e()) {
            if (m(m7Var.S().f().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m7Var);
                this.f306849b.getClientReportRecorder().c(io.sentry.clientreport.f.RATELIMIT_BACKOFF, m7Var);
            }
        }
        if (arrayList == null) {
            return g6Var;
        }
        this.f306849b.getLogger().c(y7.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (m7 m7Var2 : g6Var.e()) {
            if (!arrayList.contains(m7Var2)) {
                arrayList2.add(m7Var2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new g6(g6Var.d(), arrayList2);
        }
        this.f306849b.getLogger().c(y7.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        o(n0Var, false);
        return null;
    }

    public boolean j(@NotNull io.sentry.o oVar) {
        Date date;
        Date date2 = new Date(this.f306848a.a());
        Date date3 = this.f306850c.get(io.sentry.o.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.o.Unknown.equals(oVar) || (date = this.f306850c.get(oVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean l() {
        Date date = new Date(this.f306848a.a());
        Iterator<io.sentry.o> it = this.f306850c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = this.f306850c.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public void t(@NotNull b bVar) {
        this.f306851d.remove(bVar);
    }

    public void x(@Nullable String str, @Nullable String str2, int i10) {
        if (str == null) {
            if (i10 == 429) {
                f(io.sentry.o.All, new Date(this.f306848a.a() + r(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(",", -1)) {
            String[] strArrSplit = str3.replace(" ", "").split(":", -1);
            if (strArrSplit.length > 0) {
                long jR = r(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[1];
                    Date date = new Date(this.f306848a.a() + jR);
                    if (str4 == null || str4.isEmpty()) {
                        f(io.sentry.o.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            io.sentry.o oVarValueOf = io.sentry.o.Unknown;
                            try {
                                String strC = h0.c(str5);
                                if (strC != null) {
                                    oVarValueOf = io.sentry.o.valueOf(strC);
                                } else {
                                    this.f306849b.getLogger().c(y7.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e10) {
                                this.f306849b.getLogger().b(y7.INFO, e10, "Unknown category: %s", str5);
                            }
                            if (!io.sentry.o.Unknown.equals(oVarValueOf)) {
                                f(oVarValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }

    public a0(@NotNull n8 n8Var) {
        this(n.b(), n8Var);
    }
}
