package androidx.media3.container;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
@b1
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f62232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<o0> f62233b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f62234c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f62235d = new PriorityQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62236e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private a f62237f;

    private static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f62239b = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<o0> f62238a = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f62239b, aVar.f62239b);
        }

        public void c(long j10, o0 o0Var) {
            androidx.media3.common.util.a.a(j10 != -9223372036854775807L);
            androidx.media3.common.util.a.i(this.f62238a.isEmpty());
            this.f62239b = j10;
            this.f62238a.add(o0Var);
        }
    }

    public interface b {
        void a(long j10, o0 o0Var);
    }

    public j(b bVar) {
        this.f62232a = bVar;
    }

    private o0 c(o0 o0Var) {
        o0 o0Var2 = this.f62233b.isEmpty() ? new o0() : this.f62233b.pop();
        o0Var2.W(o0Var.a());
        System.arraycopy(o0Var.e(), o0Var.f(), o0Var2.e(), 0, o0Var2.a());
        return o0Var2;
    }

    private void e(int i10) {
        while (this.f62235d.size() > i10) {
            a aVar = (a) k1.o(this.f62235d.poll());
            for (int i11 = 0; i11 < aVar.f62238a.size(); i11++) {
                this.f62232a.a(aVar.f62239b, aVar.f62238a.get(i11));
                this.f62233b.push(aVar.f62238a.get(i11));
            }
            aVar.f62238a.clear();
            a aVar2 = this.f62237f;
            if (aVar2 != null && aVar2.f62239b == aVar.f62239b) {
                int i12 = 0 >> 0;
                this.f62237f = null;
            }
            this.f62234c.push(aVar);
        }
    }

    public void a(long j10, o0 o0Var) {
        int i10 = this.f62236e;
        if (i10 == 0 || (i10 != -1 && this.f62235d.size() >= this.f62236e && j10 < ((a) k1.o(this.f62235d.peek())).f62239b)) {
            this.f62232a.a(j10, o0Var);
            return;
        }
        o0 o0VarC = c(o0Var);
        a aVar = this.f62237f;
        if (aVar != null && j10 == aVar.f62239b) {
            aVar.f62238a.add(o0VarC);
            return;
        }
        a aVar2 = this.f62234c.isEmpty() ? new a() : this.f62234c.pop();
        aVar2.c(j10, o0VarC);
        this.f62235d.add(aVar2);
        this.f62237f = aVar2;
        int i11 = this.f62236e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f62235d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.f62236e;
    }

    public void g(int i10) {
        androidx.media3.common.util.a.i(i10 >= 0);
        this.f62236e = i10;
        e(i10);
    }
}
