package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import androidx.annotation.p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class c<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0487c<D> f52644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b<D> f52645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f52646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f52647e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f52648f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52649g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52650h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52651i = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            c.this.p();
        }
    }

    public interface b<D> {
        void a(@NonNull c<D> cVar);
    }

    /* JADX INFO: renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    public interface InterfaceC0487c<D> {
        void a(@NonNull c<D> cVar, @p0 D d10);
    }

    public c(@NonNull Context context) {
        this.f52646d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z10 = this.f52650h;
        this.f52650h = false;
        this.f52651i |= z10;
        return z10;
    }

    @l0
    public void B(@NonNull InterfaceC0487c<D> interfaceC0487c) {
        InterfaceC0487c<D> interfaceC0487c2 = this.f52644b;
        if (interfaceC0487c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0487c2 != interfaceC0487c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f52644b = null;
    }

    @l0
    public void C(@NonNull b<D> bVar) {
        b<D> bVar2 = this.f52645c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f52645c = null;
    }

    @l0
    public void a() {
        this.f52648f = true;
        n();
    }

    @l0
    public boolean b() {
        return o();
    }

    public void c() {
        this.f52651i = false;
    }

    @NonNull
    public String d(@p0 D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        if (d10 == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
        } else {
            Class<?> cls = d10.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    @l0
    public void e() {
        b<D> bVar = this.f52645c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @l0
    public void f(@p0 D d10) {
        InterfaceC0487c<D> interfaceC0487c = this.f52644b;
        if (interfaceC0487c != null) {
            interfaceC0487c.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f52643a);
        printWriter.print(" mListener=");
        printWriter.println(this.f52644b);
        if (this.f52647e || this.f52650h || this.f52651i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f52647e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f52650h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f52651i);
        }
        if (this.f52648f || this.f52649g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f52648f);
            printWriter.print(" mReset=");
            printWriter.println(this.f52649g);
        }
    }

    @l0
    public void h() {
        q();
    }

    @NonNull
    public Context i() {
        return this.f52646d;
    }

    public int j() {
        return this.f52643a;
    }

    public boolean k() {
        return this.f52648f;
    }

    public boolean l() {
        return this.f52649g;
    }

    public boolean m() {
        return this.f52647e;
    }

    @l0
    protected void n() {
    }

    @l0
    protected boolean o() {
        return false;
    }

    @l0
    public void p() {
        if (this.f52647e) {
            h();
        } else {
            this.f52650h = true;
        }
    }

    @l0
    protected void q() {
    }

    @l0
    protected void r() {
    }

    @l0
    protected void s() {
    }

    @l0
    protected void t() {
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f52643a);
        sb2.append("}");
        return sb2.toString();
    }

    @l0
    public void u(int i10, @NonNull InterfaceC0487c<D> interfaceC0487c) {
        if (this.f52644b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f52644b = interfaceC0487c;
        this.f52643a = i10;
    }

    @l0
    public void v(@NonNull b<D> bVar) {
        if (this.f52645c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f52645c = bVar;
    }

    @l0
    public void w() {
        r();
        this.f52649g = true;
        this.f52647e = false;
        this.f52648f = false;
        this.f52650h = false;
        this.f52651i = false;
    }

    public void x() {
        if (this.f52651i) {
            p();
        }
    }

    @l0
    public final void y() {
        this.f52647e = true;
        this.f52649g = false;
        this.f52648f = false;
        s();
    }

    @l0
    public void z() {
        this.f52647e = false;
        t();
    }
}
