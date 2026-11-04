package com.rabbitmq.client.impl;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

/* JADX INFO: loaded from: classes13.dex */
public class p1 extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MetricRegistry f265644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Counter f265645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Counter f265646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Meter f265647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Meter f265648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Meter f265649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Meter f265650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Meter f265651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Meter f265652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Meter f265653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Meter f265654o;

    public p1(MetricRegistry metricRegistry, String str) {
        this.f265644e = metricRegistry;
        this.f265645f = metricRegistry.counter(str + ".connections");
        this.f265646g = metricRegistry.counter(str + ".channels");
        this.f265647h = metricRegistry.meter(str + ".published");
        this.f265651l = metricRegistry.meter(str + ".failed_to_publish");
        this.f265652m = metricRegistry.meter(str + ".publish_ack");
        this.f265653n = metricRegistry.meter(str + ".publish_nack");
        this.f265654o = metricRegistry.meter(str + ".publish_unrouted");
        this.f265648i = metricRegistry.meter(str + ".consumed");
        this.f265649j = metricRegistry.meter(str + ".acknowledged");
        this.f265650k = metricRegistry.meter(str + ".rejected");
    }

    @Override // com.rabbitmq.client.impl.q
    protected void A(com.rabbitmq.client.p pVar) {
        this.f265645f.inc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.q
    public void B() {
        this.f265649j.mark();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void C() {
        this.f265648i.mark();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void D() {
        this.f265652m.mark();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void E() {
        this.f265651l.mark();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void F() {
        this.f265653n.mark();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void G() {
        this.f265647h.mark();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void H() {
        this.f265654o.mark();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.q
    public void I() {
        this.f265650k.mark();
    }

    public Meter K() {
        return this.f265649j;
    }

    public Counter L() {
        return this.f265646g;
    }

    public Counter M() {
        return this.f265645f;
    }

    public Meter N() {
        return this.f265648i;
    }

    public Meter O() {
        return this.f265651l;
    }

    public MetricRegistry P() {
        return this.f265644e;
    }

    public Meter Q() {
        return this.f265652m;
    }

    public Meter R() {
        return this.f265653n;
    }

    public Meter S() {
        return this.f265654o;
    }

    public Meter T() {
        return this.f265647h;
    }

    public Meter U() {
        return this.f265650k;
    }

    @Override // com.rabbitmq.client.impl.q
    protected void x(com.rabbitmq.client.k kVar) {
        this.f265646g.dec();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void y(com.rabbitmq.client.p pVar) {
        this.f265645f.dec();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void z(com.rabbitmq.client.k kVar) {
        this.f265646g.inc();
    }

    public p1() {
        this(new MetricRegistry());
    }

    public p1(MetricRegistry metricRegistry) {
        this(metricRegistry, "rabbitmq");
    }
}
