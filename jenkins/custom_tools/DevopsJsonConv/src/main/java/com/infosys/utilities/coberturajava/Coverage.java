//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.05 at 06:13:35 PM IST 
//
package com.infosys.utilities.coberturajava;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coverage", namespace = "http://www.coverage.org", propOrder = { "sources", "packages" })
@XmlRootElement(name = "coverage")
public class Coverage {
	@XmlElement(required = true)
	protected Coverage.Sources sources;
	@XmlElement(required = true)
	protected Coverage.Packages packages;
	@XmlAttribute(name = "line-rate")
	protected Float lineRate;
	@XmlAttribute(name = "branch-rate")
	protected Float branchRate;
	@XmlAttribute(name = "lines-covered")
	protected Byte linesCovered;
	@XmlAttribute(name = "lines-valid")
	protected Byte linesValid;
	@XmlAttribute(name = "branches-covered")
	protected Byte branchesCovered;
	@XmlAttribute(name = "branches-valid")
	protected Byte branchesValid;
	@XmlAttribute(name = "complexity")
	protected Float complexity;
	@XmlAttribute(name = "version")
	protected String version;
	@XmlAttribute(name = "timestamp")
	protected Long timestamp;

	public Coverage.Sources getSources() {
		return sources;
	}

	public void setSources(Coverage.Sources value) {
		this.sources = value;
	}

	public Coverage.Packages getPackages() {
		return packages;
	}

	public void setPackages(Coverage.Packages value) {
		this.packages = value;
	}

	public Float getLineRate() {
		return lineRate;
	}

	public void setLineRate(Float value) {
		this.lineRate = value;
	}

	public Float getBranchRate() {
		return branchRate;
	}

	public void setBranchRate(Float value) {
		this.branchRate = value;
	}

	public Byte getLinesCovered() {
		return linesCovered;
	}

	public void setLinesCovered(Byte value) {
		this.linesCovered = value;
	}

	public Byte getLinesValid() {
		return linesValid;
	}

	public void setLinesValid(Byte value) {
		this.linesValid = value;
	}

	public Byte getBranchesCovered() {
		return branchesCovered;
	}

	public void setBranchesCovered(Byte value) {
		this.branchesCovered = value;
	}

	public Byte getBranchesValid() {
		return branchesValid;
	}

	public void setBranchesValid(Byte value) {
		this.branchesValid = value;
	}

	public Float getComplexity() {
		return complexity;
	}

	public void setComplexity(Float value) {
		this.complexity = value;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String value) {
		this.version = value;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long value) {
		this.timestamp = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "_package" })
	public static class Packages {
		@XmlElement(name = "package")
		protected List<Coverage.Packages.Package> _package;

		public List<Coverage.Packages.Package> getPackage() {
			if (_package == null) {
				_package = new ArrayList<Coverage.Packages.Package>();
			}
			return this._package;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "classes" })
		public static class Package {
			@XmlElement(required = true)
			protected Coverage.Packages.Package.Classes classes;
			@XmlAttribute(name = "name")
			protected String name;
			@XmlAttribute(name = "line-rate")
			protected Float lineRate;
			@XmlAttribute(name = "branch-rate")
			protected Float branchRate;
			@XmlAttribute(name = "complexity")
			protected Float complexity;

			public Coverage.Packages.Package.Classes getClasses() {
				return classes;
			}

			public void setClasses(Coverage.Packages.Package.Classes value) {
				this.classes = value;
			}

			public String getName() {
				return name;
			}

			public void setName(String value) {
				this.name = value;
			}

			public Float getLineRate() {
				return lineRate;
			}

			public void setLineRate(Float value) {
				this.lineRate = value;
			}

			public Float getBranchRate() {
				return branchRate;
			}

			public void setBranchRate(Float value) {
				this.branchRate = value;
			}

			public Float getComplexity() {
				return complexity;
			}

			public void setComplexity(Float value) {
				this.complexity = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "clazz" })
			public static class Classes {
				@XmlElement(name = "class")
				protected List<Coverage.Packages.Package.Classes.Class> clazz;

				public List<Coverage.Packages.Package.Classes.Class> getClazz() {
					if (clazz == null) {
						clazz = new ArrayList<Coverage.Packages.Package.Classes.Class>();
					}
					return this.clazz;
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "methods", "lines" })
				public static class Class {
					@XmlElement(required = true)
					protected Coverage.Packages.Package.Classes.Class.Methods methods;
					@XmlElement(required = true)
					protected Coverage.Packages.Package.Classes.Class.Lines lines;
					@XmlAttribute(name = "name")
					protected String name;
					@XmlAttribute(name = "filename")
					protected String filename;
					@XmlAttribute(name = "line-rate")
					protected Float lineRate;
					@XmlAttribute(name = "branch-rate")
					protected Float branchRate;
					@XmlAttribute(name = "complexity")
					protected Double complexity;

					public Coverage.Packages.Package.Classes.Class.Methods getMethods() {
						return methods;
					}

					public void setMethods(Coverage.Packages.Package.Classes.Class.Methods value) {
						this.methods = value;
					}

					public Coverage.Packages.Package.Classes.Class.Lines getLines() {
						return lines;
					}

					public void setLines(Coverage.Packages.Package.Classes.Class.Lines value) {
						this.lines = value;
					}

					public String getName() {
						return name;
					}

					public void setName(String value) {
						this.name = value;
					}

					public String getFilename() {
						return filename;
					}

					public void setFilename(String value) {
						this.filename = value;
					}

					public Float getLineRate() {
						return lineRate;
					}

					public void setLineRate(Float value) {
						this.lineRate = value;
					}

					public Float getBranchRate() {
						return branchRate;
					}

					public void setBranchRate(Float value) {
						this.branchRate = value;
					}

					public Double getComplexity() {
						return complexity;
					}

					public void setComplexity(Double value) {
						this.complexity = value;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "line" })
					public static class Lines {
						// @XmlElementRef(name = "line", type =
						// JAXBElement.class, required = false)
						// @XmlMixed
						protected List<com.infosys.utilities.coberturajava.Coverage.Packages.Package.Classes.Class.Lines.Line> line;

						public List<com.infosys.utilities.coberturajava.Coverage.Packages.Package.Classes.Class.Lines.Line> getLine() {
							if (line == null) {
								line = new ArrayList<com.infosys.utilities.coberturajava.Coverage.Packages.Package.Classes.Class.Lines.Line>();
							}
							return this.line;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "content" })
						public static class Line {
							@XmlElementRef(name = "conditions", type = JAXBElement.class, required = false)
							@XmlMixed
							protected List<Serializable> content;
							@XmlAttribute(name = "number")
							protected Byte number;
							@XmlAttribute(name = "hits")
							protected Byte hits;
							@XmlAttribute(name = "branch")
							protected String branch;
							@XmlAttribute(name = "condition-coverage")
							protected String conditionCoverage;

							public List<Serializable> getContent() {
								if (content == null) {
									content = new ArrayList<Serializable>();
								}
								return this.content;
							}

							public Byte getNumber() {
								return number;
							}

							public void setNumber(Byte value) {
								this.number = value;
							}

							public Byte getHits() {
								return hits;
							}

							public void setHits(Byte value) {
								this.hits = value;
							}

							public String getBranch() {
								return branch;
							}

							public void setBranch(String value) {
								this.branch = value;
							}

							public String getConditionCoverage() {
								return conditionCoverage;
							}

							public void setConditionCoverage(String value) {
								this.conditionCoverage = value;
							}

							@XmlAccessorType(XmlAccessType.FIELD)
							@XmlType(name = "", propOrder = { "condition" })
							public static class Conditions {
								@XmlElement(required = true)
								protected Coverage.Packages.Package.Classes.Class.Lines.Line.Conditions.Condition condition;

								public Coverage.Packages.Package.Classes.Class.Lines.Line.Conditions.Condition getCondition() {
									return condition;
								}

								public void setCondition(
										Coverage.Packages.Package.Classes.Class.Lines.Line.Conditions.Condition value) {
									this.condition = value;
								}

								@XmlAccessorType(XmlAccessType.FIELD)
								@XmlType(name = "", propOrder = { "value" })
								public static class Condition {
									@XmlValue
									protected String value;
									@XmlAttribute(name = "number")
									protected Byte number;
									@XmlAttribute(name = "type")
									protected String type;
									@XmlAttribute(name = "coverage")
									protected String coverage;

									public String getValue() {
										return value;
									}

									public void setValue(String value) {
										this.value = value;
									}

									public Byte getNumber() {
										return number;
									}

									public void setNumber(Byte value) {
										this.number = value;
									}

									public String getType() {
										return type;
									}

									public void setType(String value) {
										this.type = value;
									}

									public String getCoverage() {
										return coverage;
									}

									public void setCoverage(String value) {
										this.coverage = value;
									}
								}
							}
						}
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "method" })
					public static class Methods {
						// @XmlElementRef(name = "method", type =
						// JAXBElement.class, required = false)
						// @XmlMixed
						protected List<com.infosys.utilities.coberturajava.Coverage.Packages.Package.Classes.Class.Methods.Method> method;

						public List<com.infosys.utilities.coberturajava.Coverage.Packages.Package.Classes.Class.Methods.Method> getMethod() {
							if (method == null) {
								method = new ArrayList<com.infosys.utilities.coberturajava.Coverage.Packages.Package.Classes.Class.Methods.Method>();
							}
							return this.method;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "lines" })
						public static class Method {
							@XmlElement(required = true)
							protected Coverage.Packages.Package.Classes.Class.Methods.Method.Lines lines;
							@XmlAttribute(name = "name")
							protected String name;
							@XmlAttribute(name = "signature")
							protected String signature;
							@XmlAttribute(name = "line-rate")
							protected Float lineRate;
							@XmlAttribute(name = "branch-rate")
							protected Float branchRate;

							public Coverage.Packages.Package.Classes.Class.Methods.Method.Lines getLines() {
								return lines;
							}

							public void setLines(Coverage.Packages.Package.Classes.Class.Methods.Method.Lines value) {
								this.lines = value;
							}

							public String getName() {
								return name;
							}

							public void setName(String value) {
								this.name = value;
							}

							public String getSignature() {
								return signature;
							}

							public void setSignature(String value) {
								this.signature = value;
							}

							public Float getLineRate() {
								return lineRate;
							}

							public void setLineRate(Float value) {
								this.lineRate = value;
							}

							public Float getBranchRate() {
								return branchRate;
							}

							public void setBranchRate(Float value) {
								this.branchRate = value;
							}

							@XmlAccessorType(XmlAccessType.FIELD)
							@XmlType(name = "", propOrder = { "line" })
							public static class Lines {
								protected List<Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line> line;

								public List<Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line> getLine() {
									if (line == null) {
										line = new ArrayList<Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line>();
									}
									return this.line;
								}

								@XmlAccessorType(XmlAccessType.FIELD)
								@XmlType(name = "", propOrder = { "content" })
								public static class Line {
									@XmlElementRef(name = "conditions", type = JAXBElement.class, required = false)
									@XmlMixed
									protected List<Serializable> content;
									@XmlAttribute(name = "number")
									protected Byte number;
									@XmlAttribute(name = "hits")
									protected Byte hits;
									@XmlAttribute(name = "branch")
									protected String branch;
									@XmlAttribute(name = "condition-coverage")
									protected String conditionCoverage;

									public List<Serializable> getContent() {
										if (content == null) {
											content = new ArrayList<Serializable>();
										}
										return this.content;
									}

									public Byte getNumber() {
										return number;
									}

									public void setNumber(Byte value) {
										this.number = value;
									}

									public Byte getHits() {
										return hits;
									}

									public void setHits(Byte value) {
										this.hits = value;
									}

									public String getBranch() {
										return branch;
									}

									public void setBranch(String value) {
										this.branch = value;
									}

									public String getConditionCoverage() {
										return conditionCoverage;
									}

									public void setConditionCoverage(String value) {
										this.conditionCoverage = value;
									}

									@XmlAccessorType(XmlAccessType.FIELD)
									@XmlType(name = "", propOrder = { "condition" })
									public static class Conditions {
										@XmlElement(required = true)
										protected Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line.Conditions.Condition condition;

										public Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line.Conditions.Condition getCondition() {
											return condition;
										}

										public void setCondition(
												Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line.Conditions.Condition value) {
											this.condition = value;
										}

										@XmlAccessorType(XmlAccessType.FIELD)
										@XmlType(name = "", propOrder = { "value" })
										public static class Condition {
											@XmlValue
											protected String value;
											@XmlAttribute(name = "number")
											protected Byte number;
											@XmlAttribute(name = "type")
											protected String type;
											@XmlAttribute(name = "coverage")
											protected String coverage;

											public String getValue() {
												return value;
											}

											public void setValue(String value) {
												this.value = value;
											}

											public Byte getNumber() {
												return number;
											}

											public void setNumber(Byte value) {
												this.number = value;
											}

											public String getType() {
												return type;
											}

											public void setType(String value) {
												this.type = value;
											}

											public String getCoverage() {
												return coverage;
											}

											public void setCoverage(String value) {
												this.coverage = value;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "source" })
	public static class Sources {
		protected List<String> source;

		public List<String> getSource() {
			if (source == null) {
				source = new ArrayList<String>();
			}
			return this.source;
		}
	}
}