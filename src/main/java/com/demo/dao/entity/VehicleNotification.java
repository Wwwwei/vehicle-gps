package com.demo.dao.entity;

public class VehicleNotification {
    private Integer nid;

    private Long id;

    private String code;

    private String gpstime;

    private Long lng;

    private Long lat;

    private Long av;

    private Long veo;

    private String dir;

    private Long dis;

    private Long offsetlng;

    private Long offsetlat;

    private Long mol0;

    private Long mol1;

    private Long xhqd;

    private Long wxgs;

    private String sim;

    private String stat;

    private String alarm;

    private String oil;

    private String createtime;

    private String diming;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getGpstime() {
        return gpstime;
    }

    public void setGpstime(String gpstime) {
        this.gpstime = gpstime == null ? null : gpstime.trim();
    }

    public Long getLng() {
        return lng;
    }

    public void setLng(Long lng) {
        this.lng = lng;
    }

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getAv() {
        return av;
    }

    public void setAv(Long av) {
        this.av = av;
    }

    public Long getVeo() {
        return veo;
    }

    public void setVeo(Long veo) {
        this.veo = veo;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir == null ? null : dir.trim();
    }

    public Long getDis() {
        return dis;
    }

    public void setDis(Long dis) {
        this.dis = dis;
    }

    public Long getOffsetlng() {
        return offsetlng;
    }

    public void setOffsetlng(Long offsetlng) {
        this.offsetlng = offsetlng;
    }

    public Long getOffsetlat() {
        return offsetlat;
    }

    public void setOffsetlat(Long offsetlat) {
        this.offsetlat = offsetlat;
    }

    public Long getMol0() {
        return mol0;
    }

    public void setMol0(Long mol0) {
        this.mol0 = mol0;
    }

    public Long getMol1() {
        return mol1;
    }

    public void setMol1(Long mol1) {
        this.mol1 = mol1;
    }

    public Long getXhqd() {
        return xhqd;
    }

    public void setXhqd(Long xhqd) {
        this.xhqd = xhqd;
    }

    public Long getWxgs() {
        return wxgs;
    }

    public void setWxgs(Long wxgs) {
        this.wxgs = wxgs;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim == null ? null : sim.trim();
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm == null ? null : alarm.trim();
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil == null ? null : oil.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getDiming() {
        return diming;
    }

    public void setDiming(String diming) {
        this.diming = diming == null ? null : diming.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VehicleNotification other = (VehicleNotification) that;
        return (this.getNid() == null ? other.getNid() == null : this.getNid().equals(other.getNid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getGpstime() == null ? other.getGpstime() == null : this.getGpstime().equals(other.getGpstime()))
            && (this.getLng() == null ? other.getLng() == null : this.getLng().equals(other.getLng()))
            && (this.getLat() == null ? other.getLat() == null : this.getLat().equals(other.getLat()))
            && (this.getAv() == null ? other.getAv() == null : this.getAv().equals(other.getAv()))
            && (this.getVeo() == null ? other.getVeo() == null : this.getVeo().equals(other.getVeo()))
            && (this.getDir() == null ? other.getDir() == null : this.getDir().equals(other.getDir()))
            && (this.getDis() == null ? other.getDis() == null : this.getDis().equals(other.getDis()))
            && (this.getOffsetlng() == null ? other.getOffsetlng() == null : this.getOffsetlng().equals(other.getOffsetlng()))
            && (this.getOffsetlat() == null ? other.getOffsetlat() == null : this.getOffsetlat().equals(other.getOffsetlat()))
            && (this.getMol0() == null ? other.getMol0() == null : this.getMol0().equals(other.getMol0()))
            && (this.getMol1() == null ? other.getMol1() == null : this.getMol1().equals(other.getMol1()))
            && (this.getXhqd() == null ? other.getXhqd() == null : this.getXhqd().equals(other.getXhqd()))
            && (this.getWxgs() == null ? other.getWxgs() == null : this.getWxgs().equals(other.getWxgs()))
            && (this.getSim() == null ? other.getSim() == null : this.getSim().equals(other.getSim()))
            && (this.getStat() == null ? other.getStat() == null : this.getStat().equals(other.getStat()))
            && (this.getAlarm() == null ? other.getAlarm() == null : this.getAlarm().equals(other.getAlarm()))
            && (this.getOil() == null ? other.getOil() == null : this.getOil().equals(other.getOil()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getDiming() == null ? other.getDiming() == null : this.getDiming().equals(other.getDiming()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNid() == null) ? 0 : getNid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getGpstime() == null) ? 0 : getGpstime().hashCode());
        result = prime * result + ((getLng() == null) ? 0 : getLng().hashCode());
        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());
        result = prime * result + ((getAv() == null) ? 0 : getAv().hashCode());
        result = prime * result + ((getVeo() == null) ? 0 : getVeo().hashCode());
        result = prime * result + ((getDir() == null) ? 0 : getDir().hashCode());
        result = prime * result + ((getDis() == null) ? 0 : getDis().hashCode());
        result = prime * result + ((getOffsetlng() == null) ? 0 : getOffsetlng().hashCode());
        result = prime * result + ((getOffsetlat() == null) ? 0 : getOffsetlat().hashCode());
        result = prime * result + ((getMol0() == null) ? 0 : getMol0().hashCode());
        result = prime * result + ((getMol1() == null) ? 0 : getMol1().hashCode());
        result = prime * result + ((getXhqd() == null) ? 0 : getXhqd().hashCode());
        result = prime * result + ((getWxgs() == null) ? 0 : getWxgs().hashCode());
        result = prime * result + ((getSim() == null) ? 0 : getSim().hashCode());
        result = prime * result + ((getStat() == null) ? 0 : getStat().hashCode());
        result = prime * result + ((getAlarm() == null) ? 0 : getAlarm().hashCode());
        result = prime * result + ((getOil() == null) ? 0 : getOil().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getDiming() == null) ? 0 : getDiming().hashCode());
        return result;
    }
}