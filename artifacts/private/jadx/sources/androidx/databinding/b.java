package androidx.databinding;

/* JADX INFO: loaded from: classes2.dex */
abstract class b extends androidx.databinding.a {

    class a extends u.a {
        a() {
        }

        @Override // androidx.databinding.u.a
        public void c(u uVar, int i10) {
            b.this.c();
        }
    }

    public b() {
    }

    public b(u... uVarArr) {
        if (uVarArr == null || uVarArr.length == 0) {
            return;
        }
        a aVar = new a();
        for (u uVar : uVarArr) {
            uVar.a(aVar);
        }
    }
}
