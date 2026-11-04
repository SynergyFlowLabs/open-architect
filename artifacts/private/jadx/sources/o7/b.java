package o7;

import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
public class b extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v
    private a f333591d;

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return (b) super.clone();
    }

    public final a n() {
        return this.f333591d;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b p(String str, Object obj) {
        return (b) super.p(str, obj);
    }

    public final void p(a aVar) {
        this.f333591d = aVar;
    }
}
