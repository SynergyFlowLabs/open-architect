package org.apache.commons.lang3.text;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class a extends Format {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f337274c = -4329119827877627683L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Format f337275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Format f337276b;

    public a(Format format, Format format2) {
        this.f337275a = format;
        this.f337276b = format2;
    }

    public Format a() {
        return this.f337276b;
    }

    public Format b() {
        return this.f337275a;
    }

    public String c(String str) throws ParseException {
        return format(parseObject(str));
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.f337276b.format(obj, stringBuffer, fieldPosition);
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.f337275a.parseObject(str, parsePosition);
    }
}
