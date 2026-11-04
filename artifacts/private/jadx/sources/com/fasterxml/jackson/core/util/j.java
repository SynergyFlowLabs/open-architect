package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class j extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final JsonParser[] f102823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final boolean f102824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f102825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f102826k;

    @Deprecated
    protected j(JsonParser[] jsonParserArr) {
        this(false, jsonParserArr);
    }

    @Deprecated
    public static j v3(JsonParser jsonParser, JsonParser jsonParser2) {
        return w3(false, jsonParser, jsonParser2);
    }

    public static j w3(boolean z10, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z11 = jsonParser instanceof j;
        if (!z11 && !(jsonParser2 instanceof j)) {
            return new j(z10, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            ((j) jsonParser).s3(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof j) {
            ((j) jsonParser2).s3(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new j(z10, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.n E2() throws IOException {
        JsonParser jsonParser = this.f102822g;
        if (jsonParser == null) {
            return null;
        }
        if (this.f102826k) {
            this.f102826k = false;
            return jsonParser.t();
        }
        com.fasterxml.jackson.core.n nVarE2 = jsonParser.E2();
        return nVarE2 == null ? x3() : nVarE2;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            this.f102822g.close();
        } while (y3());
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public JsonParser r3() throws IOException {
        if (this.f102822g.t() == com.fasterxml.jackson.core.n.START_OBJECT || this.f102822g.t() == com.fasterxml.jackson.core.n.START_ARRAY) {
            int i10 = 1;
            while (true) {
                com.fasterxml.jackson.core.n nVarE2 = E2();
                if (nVarE2 == null) {
                    break;
                }
                if (!nVarE2.t()) {
                    if (nVarE2.s() && (i10 = i10 - 1) == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        return this;
    }

    protected void s3(List<JsonParser> list) {
        int length = this.f102823h.length;
        for (int i10 = this.f102825j - 1; i10 < length; i10++) {
            JsonParser jsonParser = this.f102823h[i10];
            if (jsonParser instanceof j) {
                ((j) jsonParser).s3(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    public int t3() {
        return this.f102823h.length;
    }

    protected com.fasterxml.jackson.core.n x3() throws IOException {
        com.fasterxml.jackson.core.n nVarE2;
        do {
            int i10 = this.f102825j;
            JsonParser[] jsonParserArr = this.f102823h;
            if (i10 >= jsonParserArr.length) {
                return null;
            }
            this.f102825j = i10 + 1;
            JsonParser jsonParser = jsonParserArr[i10];
            this.f102822g = jsonParser;
            if (this.f102824i && jsonParser.f2()) {
                return this.f102822g.g0();
            }
            nVarE2 = this.f102822g.E2();
        } while (nVarE2 == null);
        return nVarE2;
    }

    protected boolean y3() {
        int i10 = this.f102825j;
        JsonParser[] jsonParserArr = this.f102823h;
        if (i10 >= jsonParserArr.length) {
            return false;
        }
        this.f102825j = i10 + 1;
        this.f102822g = jsonParserArr[i10];
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected j(boolean z10, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z11 = false;
        this.f102824i = z10;
        if (z10 && this.f102822g.f2()) {
            z11 = true;
        }
        this.f102826k = z11;
        this.f102823h = jsonParserArr;
        this.f102825j = 1;
    }
}
