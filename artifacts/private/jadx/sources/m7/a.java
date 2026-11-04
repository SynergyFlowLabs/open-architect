package m7;

import com.google.api.client.http.q;
import java.io.IOException;
import o7.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T> implements com.google.api.client.googleapis.batch.a<T, b> {
    public abstract void c(o7.a aVar, q qVar) throws IOException;

    @Override // com.google.api.client.googleapis.batch.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(b bVar, q qVar) throws IOException {
        c(bVar.n(), qVar);
    }
}
