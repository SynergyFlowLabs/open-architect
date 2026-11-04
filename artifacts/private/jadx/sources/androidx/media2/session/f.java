package androidx.media2.session;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.MediaParcelUtils;
import com.google.common.util.concurrent.t1;

/* JADX INFO: loaded from: classes2.dex */
class f extends k implements androidx.media2.session.e.InterfaceC0547e {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final LibraryResult f58843p3 = new LibraryResult(1);

    class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58844a;

        a(MediaLibraryService.LibraryParams libraryParams) {
            this.f58844a = libraryParams;
        }

        @Override // androidx.media2.session.f.j
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.X6(f.this.f58934g, i10, MediaParcelUtils.c(this.f58844a));
        }
    }

    class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58847b;

        b(String str, MediaLibraryService.LibraryParams libraryParams) {
            this.f58846a = str;
            this.f58847b = libraryParams;
        }

        @Override // androidx.media2.session.f.j
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Yc(f.this.f58934g, i10, this.f58846a, MediaParcelUtils.c(this.f58847b));
        }
    }

    class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58849a;

        c(String str) {
            this.f58849a = str;
        }

        @Override // androidx.media2.session.f.j
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.n5(f.this.f58934g, i10, this.f58849a);
        }
    }

    class d implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58854d;

        d(String str, int i10, int i11, MediaLibraryService.LibraryParams libraryParams) {
            this.f58851a = str;
            this.f58852b = i10;
            this.f58853c = i11;
            this.f58854d = libraryParams;
        }

        @Override // androidx.media2.session.f.j
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.ue(f.this.f58934g, i10, this.f58851a, this.f58852b, this.f58853c, MediaParcelUtils.c(this.f58854d));
        }
    }

    class e implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58856a;

        e(String str) {
            this.f58856a = str;
        }

        @Override // androidx.media2.session.f.j
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.D4(f.this.f58934g, i10, this.f58856a);
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.f$f, reason: collision with other inner class name */
    class C0548f implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58859b;

        C0548f(String str, MediaLibraryService.LibraryParams libraryParams) {
            this.f58858a = str;
            this.f58859b = libraryParams;
        }

        @Override // androidx.media2.session.f.j
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.K9(f.this.f58934g, i10, this.f58858a, MediaParcelUtils.c(this.f58859b));
        }
    }

    class g implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58864d;

        g(String str, int i10, int i11, MediaLibraryService.LibraryParams libraryParams) {
            this.f58861a = str;
            this.f58862b = i10;
            this.f58863c = i11;
            this.f58864d = libraryParams;
        }

        @Override // androidx.media2.session.f.j
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.r6(f.this.f58934g, i10, this.f58861a, this.f58862b, this.f58863c, MediaParcelUtils.c(this.f58864d));
        }
    }

    class h implements androidx.media2.session.e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58868c;

        h(String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
            this.f58866a = str;
            this.f58867b = i10;
            this.f58868c = libraryParams;
        }

        @Override // androidx.media2.session.e.c
        public void a(@NonNull androidx.media2.session.e.b bVar) {
            bVar.x(f.this.o0(), this.f58866a, this.f58867b, this.f58868c);
        }
    }

    class i implements androidx.media2.session.e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58872c;

        i(String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
            this.f58870a = str;
            this.f58871b = i10;
            this.f58872c = libraryParams;
        }

        @Override // androidx.media2.session.e.c
        public void a(@NonNull androidx.media2.session.e.b bVar) {
            bVar.w(f.this.o0(), this.f58870a, this.f58871b, this.f58872c);
        }
    }

    @FunctionalInterface
    private interface j {
        void a(androidx.media2.session.c cVar, int i10) throws RemoteException;
    }

    f(Context context, MediaController mediaController, SessionToken sessionToken, @p0 Bundle bundle) {
        super(context, mediaController, sessionToken, bundle);
    }

    private t1<LibraryResult> k0(int i10, j jVar) {
        androidx.media2.session.c cVarD = d(i10);
        if (cVarD == null) {
            return LibraryResult.j(-4);
        }
        e0.a aVarA = this.f58933f.a(f58843p3);
        try {
            jVar.a(cVarD, aVarA.R());
            return aVarA;
        } catch (RemoteException unused) {
            aVarA.E(new LibraryResult(-100));
            return aVarA;
        }
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> D5(String str, MediaLibraryService.LibraryParams libraryParams) {
        return k0(SessionCommand.f58660i0, new b(str, libraryParams));
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> G4(String str) {
        return k0(SessionCommand.f58663l0, new e(str));
    }

    void Hb(String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
        o0().x(new i(str, i10, libraryParams));
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> S1(String str, MediaLibraryService.LibraryParams libraryParams) {
        return k0(SessionCommand.f58664m0, new C0548f(str, libraryParams));
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> S4(String str) {
        return k0(SessionCommand.f58661j0, new c(str));
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> Sd(String str, int i10, int i11, MediaLibraryService.LibraryParams libraryParams) {
        return k0(SessionCommand.f58665n0, new g(str, i10, i11, libraryParams));
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> Wd(MediaLibraryService.LibraryParams libraryParams) {
        return k0(50000, new a(libraryParams));
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> h7(String str, int i10, int i11, MediaLibraryService.LibraryParams libraryParams) {
        return k0(SessionCommand.f58662k0, new d(str, i10, i11, libraryParams));
    }

    @NonNull
    androidx.media2.session.e o0() {
        return (androidx.media2.session.e) this.f58928a;
    }

    void r0(String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
        o0().x(new h(str, i10, libraryParams));
    }
}
