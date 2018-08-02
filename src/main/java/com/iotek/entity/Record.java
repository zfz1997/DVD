package com.iotek.entity;

public class Record {
        int id;
        int did;
        int uid;
        String lendTime;
        String returnTime;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getLendTime() {
			return lendTime;
		}
		public void setLendTime(String lendTime) {
			this.lendTime = lendTime;
		}
		public String getReturnTime() {
			return returnTime;
		}
		public void setReturnTime(String returnTime) {
			this.returnTime = returnTime;
		}
}
