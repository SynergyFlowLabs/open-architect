package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes4.dex */
public class j extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f102484e = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected transient JsonParser f102485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.fasterxml.jackson.core.util.l f102486d;

    @Deprecated
    public j(String str, i iVar) {
        super(str, iVar);
    }

    @Override // com.fasterxml.jackson.core.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public JsonParser e() {
        return this.f102485c;
    }

    public com.fasterxml.jackson.core.util.l g() {
        return this.f102486d;
    }

    @Override // com.fasterxml.jackson.core.l, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.f102486d == null) {
            return message;
        }
        return message + "\nRequest payload : " + this.f102486d.toString();
    }

    public String h() {
        com.fasterxml.jackson.core.util.l lVar = this.f102486d;
        if (lVar != null) {
            return lVar.toString();
        }
        return null;
    }

    public j i(JsonParser jsonParser) {
        this.f102485c = jsonParser;
        return this;
    }

    public j j(com.fasterxml.jackson.core.util.l lVar) {
        this.f102486d = lVar;
        return this;
    }

    @Deprecated
    public j(String str, i iVar, Throwable th2) {
        super(str, iVar, th2);
    }

    public j(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.d0());
        this.f102485c = jsonParser;
    }

    public j(JsonParser jsonParser, String str, Throwable th2) {
        super(str, jsonParser == null ? null : jsonParser.d0(), th2);
        this.f102485c = jsonParser;
    }

    public j(JsonParser jsonParser, String str, i iVar) {
        super(str, iVar);
        this.f102485c = jsonParser;
    }

    public j(JsonParser jsonParser, String str, i iVar, Throwable th2) {
        super(str, iVar, th2);
        this.f102485c = jsonParser;
    }
}
