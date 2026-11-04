package u4;

import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f381121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short[] f381122b = new short[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<d> f381123c = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<c> f381124d = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<f> f381125e = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.utils.b<a> f381126f = new com.badlogic.gdx.utils.b<>();

    public void a(d dVar) {
        for (d dVar2 : this.f381123c) {
            if (dVar2.f381140a.equals(dVar.f381140a)) {
                throw new t("Mesh with id '" + dVar2.f381140a + "' already in model");
            }
        }
        this.f381123c.c(dVar);
    }
}
