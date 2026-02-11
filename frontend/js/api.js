
export async function apiGet(url) {
  const res = await fetch('http://localhost:8080' + url);
  return res.json();
}
