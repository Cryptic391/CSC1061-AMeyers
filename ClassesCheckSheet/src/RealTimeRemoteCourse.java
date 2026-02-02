
public class RealTimeRemoteCourse extends OnlineCourse {
		private String zoom;
		
		public RealTimeRemoteCourse() {
			super();
			this.zoom = "";
		}
		

		public RealTimeRemoteCourse(String courseNum, int numStudents, int maxStudents, int credits, String zoom) {
			super(courseNum, numStudents, maxStudents, credits);
			this.zoom = zoom;
		}

		public String getZoom() {
			return zoom;
		}

		public void setZoom(String zoom) {
			this.zoom = zoom;
		}

		@Override
		public String toString() {
			return "Real Time Remote Course - Zoom= " + zoom + super.toString();
		}
		
		
		
		

}
